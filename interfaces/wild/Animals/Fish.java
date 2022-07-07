package interfaces.wild.Animals;

import interfaces.wild.Screen.*;

public class Fish extends Animal implements Prey, CanSwimm {
    private int swimmingVelocity;
    private int finis;

    public Fish(String species, int eyes, boolean tail, int swimmingVelocity, int finis) {
        super(species, eyes, tail);
        setSwimmingVelocity(swimmingVelocity);
        setFinis(finis);
    }

    public void setSwimmingVelocity(int swimmingVelocity) {
        this.swimmingVelocity = swimmingVelocity;
    }

    public void setFinis(int finis) {
        this.finis = finis;
    }

    @Override
    public String toString() {
        return "Nome della specie: " + getSpecies() + "\nNumero di occhi [" + getEyes() + "]\nCoda " + getTail()
                + "\nVelocità di nuoto " + swimmingVelocity + "km/h" + "\nNumero di pinne " + finis + "\n";
    }

    @Override
    public void runAway() {
        System.out.println("Sto scappando dagli esseri umani");
    }

    @Override
    public boolean swimm() {
        return false;
    }
}
