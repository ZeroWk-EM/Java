package interfaces.wild.Animals;

import interfaces.wild.Screen.Predator;

public class Snake extends Animal implements Predator {
    private double lenght;
    private boolean isPoisonous;

    public Snake(String species, int eyes, boolean tail, double lenght, boolean isPoisonous) {
        super(species, eyes, tail);
        setLenght(lenght);
        setPoisonous(isPoisonous);
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public void setPoisonous(boolean isPoisonous) {
        this.isPoisonous = isPoisonous;
    }

    @Override
    public String toString() {
        return "Nome della specie: " + getSpecies() + "\nNumero di occhi [" + getEyes() + "]\nCoda " + getTail()
                + "\nLunghezza complessiva [" + lenght + "]\nVelenoso " + isPoisonous + "\n";
    }

    @Override
    public void gotoPrey() {
        System.out.println("Prima ti avveleno e poi ti mangio");
    }
}
