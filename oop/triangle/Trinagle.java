package oop.triangle;

public class Trinagle {
    private float l1, l2, l3;

    Trinagle() {
        setDim(l1, l2, l3);
    }

    public void setDim(float l1, float l2, float l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    public float getPerimeto() {
        return this.l1 + this.l2 + this.l3;
    }

    public float getArea() {
        return (l1 * l2) / 2;
    }

    public float differenza(Trinagle x) {
        return getPerimeto() - x.getPerimeto();
    }
}
