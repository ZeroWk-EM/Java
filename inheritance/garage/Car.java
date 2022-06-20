package inheritance.garage;

public class Car extends Veichle {
    private int doors;

    Car(String licenze_plate,int immatricolateYear, String brand, String fuelType, int cilinder, int doors) {
        super(licenze_plate,immatricolateYear, brand, fuelType, cilinder);
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
    public void accendi() {
        System.out.println("Auto [" + getLicenze_plate() + "] accesa");

    }

    @Override
    public void spegni() {
        System.out.println("Auto [" + getLicenze_plate() + "] spenta");

    }
}
