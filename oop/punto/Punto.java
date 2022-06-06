package oop.punto;

public class Punto {

    private int x;
    private int y;

    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void trasla(int a, int b) {
        this.x = a + this.x;
        this.y = b + this.y;
    }

}
