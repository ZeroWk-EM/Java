package videoteca.prodotti.media;

public class Music extends Media {
    private String author;
    private int numberSong;

    public Music(int id, String name, String genre, String author, int numberSong, int releseYear, double price) {
        super(id, name, genre, releseYear, price);
        setAuthor(author);
        setNumberSong(numberSong);

    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNumberSong(int numberSong) {
        this.numberSong = numberSong;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberSong() {
        return numberSong;
    }

    @Override
    public String toString() {
        return "ID " + getId()
                + "\nNome " + getName()
                + "\nGenere " + getGenre()
                + "\nAutore " + author
                + "\nNumero di canzoni" + numberSong
                + "\nAnno di uscita " + getReleseYear()
                + "\nPrezzo " + getPrice();
    }
}
