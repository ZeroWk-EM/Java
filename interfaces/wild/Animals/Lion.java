package interfaces.wild.Animals;

import interfaces.wild.Screen.Predator;

public class Lion extends Animal implements Predator {
    private int roarpower;
    private int velocityPower;

    public Lion(String species, int eyes, boolean tail, int roarpower, int velocityPower) {
        super(species, eyes, tail);
        setRoarpower(roarpower);
        setVelocityPower(velocityPower);
    }

    public void setRoarpower(int roarpower) {
        this.roarpower = roarpower;
    }

    public void setVelocityPower(int velocityPower) {
        this.velocityPower = velocityPower;
    }

    @Override
    public String toString() {
        return "Nome della specie: " + getSpecies() + "\nNumero di occhi [" + getEyes() + "]\nCoda " + getTail()
                + "\nPotenza del ruggito [" + roarpower + "]\nVelocità" + velocityPower + " km/h\n";
    }

    @Override
    public void gotoPrey() {
        System.out.println("Ora ti mangio -CIT Majinbu");
    }
}
