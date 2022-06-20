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

    public final void setLicenze_plate(String licenze_plate) {
        this.licenze_plate = licenze_plate;
    }

    public final void setImmatricolateYear(int immatricolateYear) {
        this.immatricolateYear = immatricolateYear;
    }

    public final void setBrand(String brand) {
        this.brand = brand;
    }

    public final void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public final void setCilinder(int cilinder) {
        this.cilinder = cilinder;
    }

    public final String getLicenze_plate() {
        return licenze_plate;
    }

    public final int getImmatricolateYear() {
        return immatricolateYear;
    }

    public final String getBrand() {
        return brand;
    }

    public final String getFuelType() {
        return fuelType;
    }

    public final int getCilinder() {
        return cilinder;
    }

    public abstract void accendi();

    public abstract void spegni();
}
