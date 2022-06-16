package abstracts;

public class Car extends Veichle {
    private int doors;

    Car(String licenze_plate, String brand, String model, int passengers, int doors) {
        super(licenze_plate, brand, model, passengers);
        setDoors(doors);
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    @Override
    public void accendi() {
        System.out.println("Macchina accesa");
    }

    @Override
    public String toString() {
        return getLicenze_plate() + " " + getBrand() + " " + getModel() + " " + getPassengers() + " " + this.doors
                + "\n";
    }
}
