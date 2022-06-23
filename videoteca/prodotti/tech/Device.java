package videoteca.prodotti.tech;

import videoteca.prodotti.Prodotto;

public abstract class Device extends Prodotto {
    private int id;
    private String brand;
    private String model;
    private String serialCode;
    private int releseYear;
    private String osVersion;
    private double price;

    Device(int id, String brand, String model, String serialCode, int releseYear, String osVersion, double price) {
        setId(id);
        setBrand(brand);
        setModel(model);
        setSerialCode(serialCode);
        setReleseYear(releseYear);
        setOsVersion(osVersion);
        setPrice(price);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSerialCode(String serialCode) {
        this.serialCode = serialCode;
    }

    public void setReleseYear(int releseYear) {
        this.releseYear = releseYear;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSerialCode() {
        return serialCode;
    }

    public int getReleseYear() {
        return releseYear;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public double getPrice() {
        return price;
    }
}
