package inheritance.garage;

public class Garage {

    private int maxCar;
    private int maxBike;
    private int maxRugged;

    private int currentCar = 0;
    private int currentBike = 0;
    private int currentRugged = 0;

    private int max = getMaxVeichle();
    private Veichle[] postiAuto = new Veichle[max];

    Garage(int maxCar, int maxBike, int maxRugged) {
        setMaxCar(maxCar);
        setMaxBike(maxBike);
        setMaxRugged(maxRugged);
    }

    public void setMaxBike(int maxBike) {
        this.maxBike = maxBike;
    }

    public void setMaxCar(int maxCar) {
        this.maxCar = maxCar;
    }

    public void setMaxRugged(int maxRugged) {
        this.maxRugged = maxRugged;
    }

    public int getMaxVeichle() {
        return this.maxBike + this.maxCar + this.maxRugged;
    }

    
        
}