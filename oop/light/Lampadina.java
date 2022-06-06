package oop.light;

public class Lampadina {
    private boolean state = false;
    private int max_change;
    private int counter = 0;

    boolean broken = false;

    Lampadina(int max_change) {
        this.max_change = max_change;
    }

    // Set status
    void click() {
        if (counter == this.max_change) {
            broken = true;
        } else {
            this.state = !this.state;
            counter++;
        }
    }

    // View state
    int state() {
        if (broken) {
            return -1;
        }
        if (this.state == true && broken == false) {
            return 1;
        } else if (this.state == false && broken == false) {
            return 0;
        } else {
            return 99;
        }

    }
}
