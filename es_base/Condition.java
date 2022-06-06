package es_base;

public class Condition {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c;

        if (a > b) {
            System.out.println("Sei dentro IF");
            System.out.println("A = [" + a + "] e' piu' grande di B = [" + b + "]");
        } else if (a == b) {
            System.out.println("Sei dentro ELSE IF");
            System.out.println("A = [" + a + "] e B = [" + b + "] sono uguali");
        } else {
            System.out.println("Sei dentro else");
            System.out.println("B = [" + b + "] e' piu'  grande di A = [" + a + "]");
        }

        System.out.println("=================");

        c = a - b;
        System.out.println("Operazione A-B");
        if (c >= 0) {
            System.out.println("La C = [" + c + "] non e' negativa");
        } else if (c < 0) {
            System.out.println("La C = [" + c + "] e' negativa");
        }

        System.out.println("=================");

        c = b - a;
        System.out.println("Operazione B-A");
        if (c >= 0) {
            System.out.println("La C = [" + c + "] non e' negativa");
        } else if (c < 0) {
            System.out.println("La C = [" + c + "] e' negativa");
        }
        System.out.println("=================");
    }

}
