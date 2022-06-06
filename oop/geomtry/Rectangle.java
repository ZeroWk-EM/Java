package oop.geomtry;

public class Rectangle {
    private int base;
    private int altezza;

    // Construct
    Rectangle(int a, int b) {
        setBase(a);
        setAltezza(b);
    }

    // =============== SET ============
    public void setBase(int x) {
        if (x > 0) {
            this.base = x;
        } else {
            this.base = 1;
        }
    }

    public void setAltezza(int x) {
        if (x > 0) {
            this.altezza = x;
        } else {
            this.altezza = 1;
        }
    }

    // ============ GET ===========================
    public int getPerimeto() {
        return (this.base + this.altezza) * 2;
    }

    public int getArea() {
        return this.base * this.altezza;
    }

    // =================================================
    public int getA() {
        return this.base;
    }

    public int getB() {
        return this.altezza;
    }

}
