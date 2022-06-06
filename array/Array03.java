package array;

import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {

            System.out.print("Inserisci il numero di elementi del primo array dell'array ");
            int n = reader.nextInt();
            int[] array = new int[n];

            System.out.print("Inserisci il numero di elementi del secondo array dell'array ");
            int l = reader.nextInt();
            int[] array2 = new int[l];

            // Riempimento array 1
            for (int i = 0; i < n; i++) {
                System.out.print("Inserisci l'elemento [" + i + "] dell' primo array ");
                array[i] = reader.nextInt();
            }

            // Riempimento array 2
            for (int i = 0; i < l; i++) {
                System.out.print("Inserisci l'elemento [" + i + "] dell' secondo array ");
                array2[i] = reader.nextInt();
            }
            System.out.println("============= STAMPA ARRAY 1 ============");
            // Stampa
            for (int i = 0; i < n; i++) {
                System.out.print("[" + array[i] + "]");
            }
            System.out.println("\n============= STAMPA ARRAY 2 ============");
            // Stampa
            for (int i = 0; i < l; i++) {
                System.out.print("[" + array2[i] + "]");
            }
            System.out.println("\n============= CONCATENAZIONE =============");

            int conc = (array.length + array2.length);
            int[] finalarray = new int[conc];

            // CONCATENAZIONE ARRAY
            for (int i = 0; i < n; i++) {
                finalarray[i] = array[i];
            }
            for (int i = n, j = 0; i < conc; i++) {
                finalarray[i] = array2[j];
                j++;
            }
            // STAMPA ARRAY CONCATENATO
            for (int i = 0; i < conc; i++) {
                System.out.print("[" + finalarray[i] + "]");
            }
        } finally {
            reader.close();
        }
    }
}
