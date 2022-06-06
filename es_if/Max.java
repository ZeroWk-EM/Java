package es_if;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            int a;
            int b;
            System.out.println("================================");
            System.out.println("Inserisci il primo numero");
            a = reader.nextInt();
            System.out.println("Inserisci il secondo numero");
            b = reader.nextInt();
            System.out.println("================================");
            if (a > b) {
                System.out.println("Il [" + a + "] e' più grande di [" + b + "]");
            } else if (a == b) {
                System.out.println("Il [" + a + "] e la [" + b + "] sono uguali");
            } else {
                System.out.println("Il [" + b + "] e' più grande della [" + a + "]");
            }

        } finally {
            reader.close();
        }
    }

}
