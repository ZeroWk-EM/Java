package inheritance.garage;

public class Rugged extends Veichle {
    private int cargoCapacity;

    Rugged(String licenze_plate, int immatricolateYear, String brand, String fuelType, int cilinder,
            int cargoCapacity) {
        super(licenze_plate, immatricolateYear, brand, fuelType, cilinder, false);
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
    public void switchKey() {
        if (getState() == false) {
            System.out.println("Furgone spento accesione in corso...");
            setState(!getState());
        } else {
            System.out.println("Furgone acceso spegnimento in corso...");
            setState(!getState());
        }
    }
}
