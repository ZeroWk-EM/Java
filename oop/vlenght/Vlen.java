package oop.vlenght;

public class Vlen {
    private int sum = 0;

    public void sum(int... v) {
        System.out.println("Lunghezza array [" + v.length + "]");
        System.out.println("=== VALORI INSERITI ===");
        for (int i = 0; i < v.length; i++) {
            System.out.print("[" + v[i] + "]");
        }
        for (int i = 0; i < v.length; i++) {
            sum += v[i];
        }
    }

    public int getSum(){
        return sum;
    }
}
