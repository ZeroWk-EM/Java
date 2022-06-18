package inheritance.garage;

public class Garage {

    private int maxCar=0;
    private int maxBike = 0;
    private int maxRugged = 0;

    private int currentCar = 0;
    private int currentBike = 0;
    private int currentRugged = 0;

    Garage(int maxCar, int maxBike, int maxRugged) {
        setMaxCar(maxCar);
        setMaxBike(maxBike);
        setMaxRugged(maxRugged);
    }
    
    private int totMax = getMax();
    private Veichle[] postiParcheggio = new Veichle[totMax];
    private int index = 0;

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
        return maxCar+maxRugged+maxBike;
    }

    public Veichle addVeichle(Car veichle) {
        if (currentCar > maxCar) {
            System.out.println("Non ci sono più posti per le auto");
        } else {
            currentCar++;
            postiParcheggio[index] = veichle;
            index++;
            System.out.println("Posti rimasti per le auto [" + (maxCar - currentCar) + "]");
            System.out.println("Ticket parcheggio [" + index + "]");
        }
        return veichle;
    }

    public Veichle addVeichle(Bike veichle) {
        if (currentBike > maxBike) {
            System.out.println("Non ci sono più posti per le motociclette");
        } else {
            currentBike++;
            postiParcheggio[index] = veichle;
            index++;
            System.out.println("Posti rimasti per le moto ["+(maxBike-currentBike)+"]");
            System.out.println("Ticket parcheggio ["+index+"]");
        }
        return veichle;
    }

    public Veichle addVeichle(Rugged veichle) {
        if (currentRugged > maxRugged) {
            System.out.println("Non ci sono più posti per i furgoni ");
        } else {
            currentRugged++;
            postiParcheggio[index] = veichle;
            index++;
            System.out.println("Posti rimasti per i furgoni [" + (maxRugged - currentRugged) + "]");
            System.out.println("Ticket parcheggio [" + index + "]");

        }
        return veichle;
    }

}

