package array;

import java.util.Scanner;

public class Array08 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            System.out.println("Inserisci la lunghezza dei due array array");
            int len = reader.nextInt();
            int[] array1 = new int[len];
            int[] array2 = new int[len];

            // Riempimento array 1
            for (int i = 0; i < len; i++) {
                System.out.print("Inserisci l'elemento [" + i + "] dell'array 1 ");
                array1[i] = reader.nextInt();
            }

            // Riempimento array 2
            for (int i = 0; i < len; i++) {
                System.out.print("Inserisci l'elemento [" + i + "] dell'array 2 ");
                array2[i] = reader.nextInt();
            }

            System.out.println("===== ARRAY 1 =====");

            // Stampa array 1
            for (int i = 0; i < len; i++) {
                System.out.print("[" + array1[i] + "]");
            }

            System.out.println("\n===== ARRAY 2 =====");

            // Stampa array 2
            for (int i = 0; i < len; i++) {
                System.out.print("[" + array2[i] + "]");
            }

            System.out.println("\n===== RICERCA ELEMENTI SIMILI =====");

            int simile = 0;
            // PER SCEGLIERE IL PRIMO ELEMENTO
            for (int i = 0; i < len; i++) {
                // PER PRENDERE IL PRIMO ELEMENTO E CONFRONTARLO CON TUTTI GLI ELEMENTI DEL
                // SECONDO ARRAY
                for (int j = 0; j < len; j++) {
                    if (array1[i] == array2[j]) {
                        simile++;
                        System.out.print("[" + array1[i] + "]");
                    }
                    continue;
                }
            }
            System.out.println("\nI risultati uguali dentro l'array sono [" + simile + "]");

        } finally {
            reader.close();
        }

    }
}
