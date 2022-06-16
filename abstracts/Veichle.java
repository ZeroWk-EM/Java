package abstracts;

public abstract class Veichle {
    private String licenze_plate;
    private String brand;
    private String model;
    private int passengers;


    Veichle() {

    }

    Veichle(String licenze_plate, String brand, String model, int passengers) {
        setLicenze_plate(licenze_plate);
        setBrand(brand);
        setModel(model);
        setPassengers(passengers);
    }

    public void setLicenze_plate(String licenze_plate) {
        this.licenze_plate = licenze_plate;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public abstract void accendi();

    public String getLicenze_plate() {
        return licenze_plate;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPassengers() {
        return passengers;
    }
}
