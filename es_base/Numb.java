package es_base;

import java.util.Scanner;

public class Numb {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            System.out.println("Inserisci un numero");
            int n = reader.nextInt();
            System.out.println("Quanti numeri successivi vuoi vedere");
            int succn = reader.nextInt();
            System.out.println("Quanti numeri precedenti vuoi vedere");
            int precn = reader.nextInt();
            System.out.println("====================");
            System.out.print("I primi [" + succn + "] successivi sono ");
            for (int i = 0; i < succn; i++) {
                n++;
                System.out.print("[" + n + "]");

            }
            n = n - succn;
            System.out.println("\n====================");
            System.out.print("I primi [" + precn + "] precedenti sono");
            for (int i = 0; i < precn; i++) {
                n--;
                System.out.print("[" + n + "]");
            }

        } finally {
            reader.close();
        }
    }
}
