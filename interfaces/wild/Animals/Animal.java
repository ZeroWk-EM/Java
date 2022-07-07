package interfaces.wild.Animals;

public abstract class Animal {
    private String species;
    private int eyes;
    private boolean tail = false;

    public Animal(String species, int eyes, boolean tail) {
        setSpecies(species);
        setEyes(eyes);
        setTail(tail);
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getEyes() {
        return eyes;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    public boolean getTail() {
        return tail;
    }

}
