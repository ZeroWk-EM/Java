package array;

import java.util.Scanner;

public class Array02 {
    static public void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            System.out.print("Inserisci il numero di elementi dell'array ");
            int n = reader.nextInt();
            int[] array = new int[n];
            int even = array.length / 2;
            // Riempimento
            for (int i = 0; i < n; i++) {
                System.out.print("Inserisci l'elemento [" + i + "] dell'array ");
                array[i] = reader.nextInt();
            }
            System.out.println("============= STAMPA ARRAY ============");
            // Stampa
            for (int i = 0; i < n; i++) {
                System.out.print("[" + array[i] + "]");
            }
            System.out.println("\n========== EFFETTUO LO SHIFT ==========");
            if (array.length % 2 == 0) {

                // System.out.println("["+array.length+"] e' pari");
                for (int i = 0, k = array.length - even; i < even; i++, k++) {
                    int t = array[i];
                    array[i] = array[k];
                    array[k] = t;
                }

                for (int i = 0; i < n; i++) {
                    System.out.print("[" + array[i] + "]");
                }
            } else {
                // System.out.println("["+array.length+"] e' dispari");

            }
        } finally {
            reader.close();
        }
    }
}
