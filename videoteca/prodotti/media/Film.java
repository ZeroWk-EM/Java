package videoteca.prodotti.media;

public class Film extends Media {
    private double duration;

    public Film(int id, String name, String genre, double duration, int releseYear, double price) {
        super(id, name, genre, releseYear, price);
        setDuration(duration);
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "ID" + getId()
                + " Nome " + getName()
                + " Genere " + getGenre()
                + " Durata" + duration
                + " Anno di uscita " + getReleseYear();
    }
}
