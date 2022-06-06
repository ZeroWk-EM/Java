package oop.operation;

public class Operation {
    int a;
    int b;

    // Costruttore
    Operation(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum() {
        return a + b;
    }

    public int less() {
        return a - b;
    }

    public int multi() {
        return a * b;
    }

    public double div() {
        return (double) a / b;
    }
}