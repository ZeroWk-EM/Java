package array;

import java.util.Scanner;

public class Array10 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {

            // Definizione lunghezza
            System.out.println("Inserisci la lunghezza dell'array ");
            int len = reader.nextInt();
            int[] array = new int[len];

            // Riempimento
            for (int i = 0; i < len; i++) {
                System.out.print("Inserisci l'elemento [" + i + "] dell'array ");
                array[i] = reader.nextInt();
            }

            int max = array[0];
            int countMax = 1;
            int min = array[0];
            int countMin = 1;

            // Controllo MAX e MIN
            for (int i = 1; i < len; i++) {
                if (array[i] > max) {
                    max = array[i];
                    countMax = 1;
                } else if (array[i] == max) {
                    countMax++;
                }
                if (array[i] < min) {
                    min = array[i];
                    countMin = 1;
                } else if (array[i] == min) {
                    countMin++;
                }
            }

            int count = countMax + countMin;
            int endlen = len - count;
            System.out.println("Massimo [" + max + "]");
            System.out.println("Minimo [" + min + "]");
            System.out.println(("Lunghezza nuovo array [" + endlen + "]"));

            int[] finalarray = new int[endlen];

            for (int i = 0, k = 0; i < len; i++) {
                if (array[i] != max && array[i] != min) {
                    finalarray[k] = array[i];
                    k++;
                }
            }

            // STAMPA
            for (int i = 0; i < finalarray.length; i++) {
                if (finalarray[i] == 0) {
                    continue;
                } else
                    System.out.print("[" + finalarray[i] + "]");
            }

        } finally {
            reader.close();
        }
    }
}
