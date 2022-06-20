package inheritance.garage;

public class Bike extends Veichle {
    private String type;
    private int timeMotor;

    Bike(String licenze_plate, int immatricolateYear, String brand, String fuelType, int cilinder, String type,
            int timeMotor) {
        super(licenze_plate, immatricolateYear, brand, fuelType, cilinder, false);
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
    public void switchKey() {
        if (getState() == false) {
            System.out.println("Motocicletta [" + getLicenze_plate() + "] spenta accesione in corso...");
            setState(!getState());
        } else {
            System.out.println("Motocicletta [" + getLicenze_plate() + "] accesa spegnimento in corso...");
            setState(!getState());
        }
    }
}
