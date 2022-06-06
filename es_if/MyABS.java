package es_if;

import java.util.Scanner;

public class MyABS {
    static public void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            int num;
            System.out.println("Inserisci un numero");
            num = reader.nextInt();
            System.out.println("================================");
            if (num > 0) {
                System.out.println("[" + num + "] il numero e' gia' positivo");
                System.out.println("================================");
            } else {
                System.out.print("Il numero [" + num + "]");
                num = -num;
                System.out.print(" in valore assoluto e' uguale ad [" + num + "]");
                System.out.println("\n================================");
            }
        } finally {
            reader.close();
        }
    }
}
