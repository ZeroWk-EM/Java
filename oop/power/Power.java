package oop.power;

public class Power {
    private int base;

    // Construct
    Power(int a) {
        this.base = a;
    }

    // Show the base
    public int showBase() {
        return this.base;
    }

    // Get the base
    public int pow() {
        return this.base * this.base;
    }

    // Set the base
    public void change(int a) {
        this.base = a;
    }
}
