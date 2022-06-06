package array;

import java.util.Scanner;

public class Array09 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            System.out.println("Inserisci la lunghezza dell'array ");
            int len = reader.nextInt();
            int[] array = new int[len];
            int[] arrayfinal = new int[2];
            int count = 0;

            // Riempimento
            for (int i = 0; i < array.length; i++) {
                System.out.println("Inserisci l'elemento [" + i + "] dell'array");
                array[i] = reader.nextInt();
            }

            for (int i = 0; i < array.length; i++) {
                // Evita che scorreendo si incappi in n=n
                for (int j = 0; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        continue;
                    }
                    if (array[i] > 0) {
                        if (array[i] + array[j] == 0) {
                            arrayfinal[0] = array[i];
                            arrayfinal[1] = array[j];
                            count++;
                        }
                    } else if (array[i] < 0) {
                        if (array[i] - array[j] == 0) {
                            arrayfinal[0] = array[i];
                            arrayfinal[1] = array[j];
                            count++;
                        }
                    }
                    if (count == 1) {
                        break;
                    }

                }
            }
            System.out.println("===== Controllo valori opposti =====");
            // STAMPA ARRAY FINALE
            if (arrayfinal[0] == 0 && arrayfinal[1] == 0) {
                System.out.println("");
            } else {
                for (int i = 0; i < 2; i++) {
                    System.out.print("[" + arrayfinal[i] + "] ");
                }
            }
        } finally {

            reader.close();
        }
    }

}
