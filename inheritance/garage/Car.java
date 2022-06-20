package inheritance.garage;

public class Car extends Veichle {
    private int doors;

    Car(String licenze_plate, int immatricolateYear, String brand, String fuelType, int cilinder, int doors) {
        super(licenze_plate, immatricolateYear, brand, fuelType, cilinder, false);
        setDoors(doors);
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    @Override
    public String toString() {
        return "Anno di immatricolazione [" + getImmatricolateYear() + "]\nMarca [" + getBrand() + "]\nTipo di motore ["
                + getFuelType() + "]\nCilindrata [" + getCilinder() + "]\nNumero di porte [" + this.doors + "]";
    }

    @Override
    public void switchKey() {
        if (getState() == false) {
            System.out.println("Macchina spenta accesione in corso...");
            setState(!getState());
        } else {
            System.out.println("Macchina accesa spegnimento in corso...");
            setState(!getState());
        }
    }

}
