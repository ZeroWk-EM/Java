package inheritance.garage;

public abstract class Veichle {
    private String licenze_plate;
    private int immatricolateYear;
    private String brand;
    private String fuelType;
    private int cilinder;

    Veichle(String licenze_plate, int immatricolateYear, String brand, String fuelType, int cilinder) {
        setLicenze_plate(licenze_plate);
        setImmatricolateYear(immatricolateYear);
        setBrand(brand);
        setFuelType(fuelType);
        setCilinder(cilinder);
    }

    public void setLicenze_plate(String licenze_plate) {
        this.licenze_plate = licenze_plate;
    }

    public void setImmatricolateYear(int immatricolateYear) {
        this.immatricolateYear = immatricolateYear;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setCilinder(int cilinder) {
        this.cilinder = cilinder;
    }

    public String getLicenze_plate() {
        return licenze_plate;
    }

    public int getImmatricolateYear() {
        return immatricolateYear;
    }

    public String getBrand() {
        return brand;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getCilinder() {
        return cilinder;
    }

    public abstract void accendi();

    public abstract void spegni();
}
