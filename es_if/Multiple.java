package es_if;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            int a;
            int b;
            System.out.println("Inserisci il primo numero");
            a = reader.nextInt();
            System.out.println("Inserisci un possibile multiplo");
            b = reader.nextInt();
            if ((b % a) == 0) {
                System.out.println("Il [" + a + "] e' multiplo di [" + b + "]");
            } else {
                System.out.println("Il [" + a + "] non e' multiplo di [" + b + "]");
            }
        } finally {
            reader.close();
        }
    }
}
