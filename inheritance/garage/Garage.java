package inheritance.garage;

public class Garage {

    private int maxCar, maxBike, maxRugged;
    private Veichle[] postiParcheggio;

    Garage(int maxCar, int maxBike, int maxRugged) {
        setMaxCar(maxCar);
        setMaxBike(maxBike);
        setMaxRugged(maxRugged);
        this.postiParcheggio = new Veichle[getMax()];
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

    public int getMax() {
        return maxCar + maxBike + maxRugged;
    }

    public int addVeichle(Veichle veichle) {
        for (int i = 0; i < postiParcheggio.length; i++) {
            if (postiParcheggio[i] == null) {
                postiParcheggio[i] = veichle;
                return i;
            }
        }
        return -1;
    }

    public Veichle removeVeichle(int index) {
        if (index > getMax()) {
            return null;
        }
        Veichle veichle = this.postiParcheggio[index];
        this.postiParcheggio[index] = null;
        return veichle;
    }

    public void garageStatus() {
        for (Veichle veichle : this.postiParcheggio) {
            if (veichle != null) {
                System.out.println(veichle);
            } else {
                System.out.println("Il posto e' libero");
            }

        }
    }
}
