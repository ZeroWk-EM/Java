package inheritance.garage;

public abstract class Veichle {
    private int immatricolateYear;
    private String brand;
    private String fuelType;
    private int cilinder;

    Veichle(int immatricolateYear, String brand, String fuelType, int cilinder) {
        setImmatricolateYear(immatricolateYear);
        setBrand(brand);
        setFuelType(fuelType);
        setCilinder(cilinder);
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
}
