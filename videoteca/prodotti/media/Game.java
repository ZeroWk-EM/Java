package videoteca.prodotti.media;

public class Game extends Media {
    boolean isOnline;

    Game(int id, String name, String genre, int releseYear, boolean isOnline, double price) {
        super(id, name, genre, releseYear, price);
        setOnline(isOnline);
    }

    public void setOnline(boolean isOnline) {
        this.isOnline = isOnline;
    }

    public boolean getisOnline() {
        return isOnline;
    }

    @Override
    public String toString() {
        return "ID " + getId()
                + " Nome " + getName()
                + " Genere " + getGenre()
                + " Anno di uscita " + getReleseYear()
                + " Modalita online " + isOnline;
    }
}
