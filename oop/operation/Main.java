package oop.operation;

public class Main {
    public static void main(String[] args) {
        Operation operazione = new Operation(100, 20);

        System.out.println("La somma e' [" + operazione.sum() + "]");
        System.out.println("La somma e' [" + operazione.less() + "]");
        System.out.println("La somma e' [" + operazione.multi() + "]");
        System.out.println("La somma e' [" + operazione.div() + "]");
    }
}
