package es_if;

import java.util.Scanner;

public class CrazyYear {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            int year;
            System.out.println("===============");
            System.out.println("Inserisci l'anno");
            year = reader.nextInt();
            if (year < 0) {
                System.out.println("========ERRORE========\nNon puoi andare cosi indietro");
            } else if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                System.out.println("Il [" + year + "] e' un' anno bisestile");
            } else {
                System.out.println("Il [" + year + "] non e' un' anno bisestile");
            }
        } finally {
            reader.close();
        }
    }
}
