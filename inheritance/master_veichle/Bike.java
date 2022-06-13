package inheritance.master_veichle;

public class Bike extends Veichle {
    private int cilinder;

    Bike(String licenze_plate, String brand, String model, int passengers, int cilinder) {
        super(licenze_plate, brand, model, passengers);
        setCilinder(cilinder);

    }

    public void setCilinder(int cilinder) {
        this.cilinder = cilinder;
    }

    public int getCilinder() {
        return cilinder;
    }
}
