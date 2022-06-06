package oop.circle;

public class Circle {
    private double raggio;

    public Circle(double r) {
        this.raggio = r;
    }

    public double getDiametro() {
        return this.raggio * 2;
    }

    public double getPerimetro() {
        return getDiametro() * 3.14;
    }

    public double getArea() {
        return 3.14 * (this.raggio * this.raggio);
    }

}