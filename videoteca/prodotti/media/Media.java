package videoteca.prodotti.media;

import videoteca.prodotti.Prodotto;

public abstract class Media extends Prodotto {
    private int id;
    private String name;
    private String genre;
    private int releseYear;
    private double price;

    Media(int id, String name, String genre, int releseYear, double price) {
        setId(id);
        setName(name);
        setGenre(genre);
        setReleseYear(releseYear);
        setPrice(price);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setReleseYear(int releseYear) {
        this.releseYear = releseYear;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getReleseYear() {
        return releseYear;
    }

    public double getPrice() {
        return price;
    }
}