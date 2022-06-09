package inheritance.veichle;

public class Veichle {
    private int passengers;
    private int fuel;
    private int mpg;

    public Veichle(){

    }

    public Veichle(int passengers, int fuel, int mpg) {
        setPassengers(passengers);
        setFuel(fuel);
        setMpg(mpg);
    }

    public int getFuel() {
        return fuel;
    }
    public int getMpg() {
        return mpg;
    }
    public int getPassengers() {
        return passengers;
    }
    
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
    public void setMpg(int mpg) {
        this.mpg = mpg;
    }
}
