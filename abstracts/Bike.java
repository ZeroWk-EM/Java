package abstracts;

public class Bike extends Veichle {
    private int cilinder;

    Bike(String licenze_plate, String brand, String model, int passengers, int cilinder) {
        super(licenze_plate, brand, model, passengers);
        setCilinder(cilinder);
    }

    public void setCilinder(int cilinder) {
        this.cilinder = cilinder;
    }

    @Override
    public void accendi() {
        System.out.println("Motore acceso");
    }

    @Override
    public String toString() {
        return getLicenze_plate() + " " + getBrand() + " " + getModel() + " " + getPassengers() + " " + this.cilinder+"\n";
    }
}
