package array;

import java.util.Scanner;

public class Array01 {
    static public void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            System.out.print("Inserisci il numero di elementi dell'array ");
            int n = reader.nextInt();
            int[] array = new int[n];

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
            int temp = array[array.length - 1];
            // GUARDATO ESEMPIO
            for (int i = array.length - 1; i > 0; i--) {
                array[i] = array[i - 1];
                // CON I=2 i0=3 i1=4 i2=4
                // CON I=1 i0=3 i1=3 i2=4
                // CON I=0 ESCE
            }
            // ---------------
            array[0] = temp;
            // i0=9 i1=3 i2=4
            // Stampa
            for (int i = 0; i < n; i++) {
                System.out.print("[" + array[i] + "]");
            }
        } finally {
            reader.close();
        }

    }
}
