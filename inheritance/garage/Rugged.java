package inheritance.garage;

public class Rugged extends Veichle {
    private int cargoCapacity;

    Rugged(String licenze_plate,int immatricolateYear, String brand, String fuelType, int cilinder, int cargoCapacity) {
        super(licenze_plate,immatricolateYear, brand, fuelType, cilinder);
        setCargoCapacity(cargoCapacity);
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public String toString() {
        return "Anno di immatricolazione [" + getImmatricolateYear() + "]\nMarca [" + getBrand() + "]\nTipo di motore ["
                + getFuelType() + "]\nCilindrata [" + getCilinder() + "]\nCapacita' di carico [" + this.cargoCapacity
                + "] tonnellate";
    }

    @Override
    public void accendi() {
        System.out.println("Furgone [" + getLicenze_plate() + "] acceso");
    }

    @Override
    public void spegni() {
        System.out.println("Furgone [" + getLicenze_plate() + "] spento");

    }
}
