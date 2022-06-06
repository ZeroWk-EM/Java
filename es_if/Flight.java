package es_if;

import java.util.Scanner;

public class Flight {
    static public void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            int ticket;
            int distance;
            double ticketBase = 350.00; // X
            double tax = 3.3; // Y
            double ticketDiscount = 300.00; // Z
            double finalPrice;
            double oneTicketPrice;

            System.out.println("=====ZEROWK FLIGHT COMPANY S.R.L=====");
            System.out.println("Acquistare un biglietto/i?(y/n) ");
            char ch = reader.next().charAt(0);

            if (ch == 'y' || ch == 'Y') {
                System.out.println("Quanti biglietti vuoi acquistare");
                ticket = reader.nextInt();
                System.out.println("Quanto distano le due mete in miglian");
                distance = reader.nextInt();
                if (distance > 500) {
                    finalPrice = ticketBase + (distance * tax);
                } else {
                    finalPrice = ticketDiscount + (distance * tax);
                }
                System.out.println("==Biglietti acquistati [" + ticket + "] || Distanza [" + distance + "]miglia ==");
                oneTicketPrice = finalPrice;
                if (ticket == 1) {
                    System.out.println("Costo per biglietto [" + oneTicketPrice + "]");
                    System.out.println("Il costo totale del viaggio per [" + ticket + "] biglietto sara' ["
                            + oneTicketPrice + "]");
                } else {
                    finalPrice = finalPrice * ticket;
                    System.out.println("Costo per biglietto [" + oneTicketPrice + "]");
                    System.out.println(
                            "Il costo totale del viaggio per [" + ticket + "] biglietto sara' [" + finalPrice + "]");
                }
            } else {
                System.out.println("===================");
                System.out.println("GRAZIE LO STESSO PER AVERCI SCELTO");
                System.out.println("===================");
            }
        } finally {
            reader.close();
        }
    }
}
