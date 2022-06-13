package inheritance.master_veichle;

public class Rugged extends Veichle {
    private double cargoCapacity;

    Rugged(String licenze_plate, String brand, String model, int passengers, double cargoCapacity) {
        super(licenze_plate, brand, model, passengers);
        setCargoCapacity(cargoCapacity);
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }
}
