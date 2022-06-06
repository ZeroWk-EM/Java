package array;

import java.util.Scanner;

//SE ARRAY E' A CAZZO NON SPUNTA INDEFINITO
public class Array05 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            System.out.print("Inserisci la lunghezza dell'array ");
            int num = reader.nextInt();
            int array[] = new int[num];

            // Riempimento
            for (int i = 0; i < array.length; i++) {
                System.out.print("Inserisci l'elemento [" + i + "] dell'array ");
                array[i] = reader.nextInt();
            }

            boolean isUpper = false; // Crescente
            boolean isLower = false; // decrescente
            boolean isUndefined = false; // Indefinito
            int choice = 0;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isLower = true;
                    choice = -1;
                } else if (array[i] < array[i + 1]) {

                    isUpper = true;
                    choice = 1;
                } else {
                    isUndefined = true;
                    choice = 0;
                }
            }
            System.out.println("=============");
            switch (choice) {
                case 1:
                    System.out.println("CRESCENTE");

                    break;

                case -1:
                    System.out.println("DECRESCENTE");
                    break;

                case 0:
                    System.out.println("INDEFINITO");
                    break;

                default:
                    System.out.println("ERRORE NELL'ESECUZIONE DEL PROGRAMMA");
                    break;
            }
        } finally {
            reader.close();
        }

    }
}
