//Dato un numero iniziale e uno finale stampa a schermo tutti i numeri che stanno nel mezzo
package cicli;

import java.util.Scanner;

public class ToaTob {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            System.out.print("Inserisci il numero da cui partire ");
            int num1 = reader.nextInt();
            System.out.print("Inserisci il numero a cui fermati ");
            int num2 = reader.nextInt();
            System.out.println("===================");
            for (int i = num1; i <= num2; i++) {
                System.out.print("[" + i + "] ");
            }
        } finally {
            reader.close();
        }
        System.out.println("\n===================");
    }
}