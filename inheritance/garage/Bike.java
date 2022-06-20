package inheritance.garage;

public class Bike extends Veichle {
    private String type;
    private int timeMotor;

    Bike(String licenze_plate,int immatricolateYear, String brand, String fuelType, int cilinder, String type, int timeMotor) {
        super(licenze_plate,immatricolateYear, brand, fuelType, cilinder);
        setType(type);
        setTimeMotor(timeMotor);
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTimeMotor(int timeMoter) {
        this.timeMotor = timeMoter;
    }

    @Override
    public String toString() {
        return "Anno di immatricolazione [" + getImmatricolateYear() + "]\nMarca [" + getBrand()
                + "]\nTipo di alimentazione ["
                + getFuelType() + "]\nCilindrata [" + getCilinder() + "]\nTipo[" + this.type + "\nTipo motore ["
                + this.timeMotor + "]";
    }

    @Override
    public void accendi() {
        System.out.println("Motocicletta [" + getLicenze_plate() + "] accesa");

    }

    @Override
    public void spegni() {
        System.out.println("Motocicletta [" + getLicenze_plate() + "] accesa");

    }
}
