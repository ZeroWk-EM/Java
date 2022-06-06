package es_base;

import java.util.Scanner;

public class Analize {

    public static boolean segno(int x) {
        if (x > 0) {
            return true;
        } else
            return false;
    }

    public static boolean pod(int x) {
        if (x % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int x = 1;
        try {
            while (x > 0) {
                System.out.println("Inserisci un numero");
                int numb = reader.nextInt();

                if (segno(numb)) {
                    System.out.print("Il numuero è positivo ");
                } else {
                    System.out.print("Il numero è negativo ");
                }

                if (pod(numb)) {
                    System.out.print("ed è pari\n");
                } else {
                    System.out.print("ed è dispari\n");
                }
            }
        } finally {
            reader.close();
        }
    }
}
