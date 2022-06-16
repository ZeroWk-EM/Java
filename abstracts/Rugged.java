package abstracts;

public class Rugged extends Veichle {
    private double cargoCapacity;

    Rugged(String licenze_plate, String brand, String model, int passengers, double cargoCapacity) {
        super(licenze_plate, brand, model, passengers);
        setCargoCapacity(cargoCapacity);
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
    @Override
    public void accendi() {
        System.out.println("Camion acceso");
    }

    @Override
    public String toString() {
        return getLicenze_plate() + " " + getBrand() + " " + getModel() + " " + getPassengers() + " "
                + this.cargoCapacity + "\n";
    }
}
