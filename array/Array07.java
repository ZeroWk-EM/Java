package array;

import java.util.Scanner;

public class Array07 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            System.out.print("Inserisci la grandezza dell'array ");
            int num = reader.nextInt();
            int[] array = new int[num];

            // Riempimento
            for (int i = 0; i < num; i++) {
                System.out.print("Inserisci l'elemento [" + i + "] dell'array ");
                array[i] = reader.nextInt();
            }

            int index = 0;
            int max = array[0];
            for (int i = 0; i < num; i++) {
                if (array[i] > max) {
                    max = array[i];
                    index = i;
                }
                if (array[i] == max) {
                    index = i;
                    System.out.println("Il numero più grande si trova nell'indice [" + index + "]");
                }
            }

        } finally {
            reader.close();
        }
    }
}
