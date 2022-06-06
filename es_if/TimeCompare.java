package es_if;

import java.util.Scanner;

public class TimeCompare {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {

            // TIME 1
            int h1, m1, s1;
            int loop = 1;
            System.out.println("=====[]=[]=[]=====");
            System.out.print("Inserisci l'ora del primo orologio ");
            h1 = reader.nextInt();
            while (loop == 1) {
                if (h1 > 23) {
                    System.out.print("\033\143");
                    System.out.println("=====ERRORE=====\nHai inserito [" + h1 + "]");
                    System.out.println("Non puoi inserire un ora superiore a 23 (11 p.m)\nScrivi direttamente 0");
                    System.out.println("=====[]=[]=[]=====");
                    System.out.print("Inserisci l'ora del primo orologio ");
                    h1 = reader.nextInt();
                } else {
                    loop = 0;
                }
            }
            System.out.println("=====h[" + h1 + "]=m[]=s[]=====");
            System.out.print("Inserisci i minuti del primo orologio ");
            m1 = reader.nextInt();
            loop = 1;
            while (loop == 1) {
                if (m1 > 59) {
                    System.out.print("\033\143");
                    System.out.println("=====ERRORE=====\nHai inserito [" + m1 + "]");
                    System.out.println("Non puoi inserire un ora superiore a 59\nScrivi direttamente 0");
                    System.out.println("=====[" + h1 + "]=[]=[]=====");
                    System.out.print("Inserisci i minuti del primo orologio ");
                    m1 = reader.nextInt();
                } else {
                    loop = 0;
                }
            }
            System.out.println("=====h[" + h1 + "]=m[" + m1 + "]=s[]=====");
            System.out.print("Inserisci i secondi del primo orologio ");
            s1 = reader.nextInt();
            loop = 1;
            while (loop == 1) {
                if (s1 > 59) {
                    System.out.print("\033\143");
                    System.out.println("=====ERRORE=====\nHai inserito [" + s1 + "]");
                    System.out.println("Non puoi inserire un ora superiore a 59\nScrivi direttamente 0");
                    System.out.println("=====[" + h1 + "]=[" + m1 + "]=[]=====");
                    System.out.print("Inserisci i secondi del primo orologio ");
                    s1 = reader.nextInt();
                } else {
                    loop = 0;
                }
            }
            System.out.print("\033\143");
            System.out.println("Orologio n°1 settato ad [" + h1 + "]:[" + m1 + "]:[" + s1 + "]");

            // TIME 2
            int h2, m2, s2;

            loop = 1;
            System.out.println("=====[]=[]=[]=====");
            System.out.print("Inserisci l'ora del secondo orologio ");
            h2 = reader.nextInt();
            while (loop == 1) {
                if (h2 > 23) {
                    System.out.print("\033\143");
                    System.out.println("=====ERRORE=====\nHai inserito [" + h2 + "]");
                    System.out.println("Non puoi inserire un ora superiore a 23 (11 p.m)\nScrivi direttamente 0");
                    System.out.println("=====[]=[]=[]=====");
                    System.out.print("Inserisci l'ora del primo orologio ");
                    h2 = reader.nextInt();
                } else {
                    loop = 0;
                }
            }
            System.out.println("=====h[" + h2 + "]=m[]=s[]=====");
            System.out.print("Inserisci i minuti del primo orologio ");
            m2 = reader.nextInt();
            loop = 1;
            while (loop == 1) {
                if (m2 > 59) {
                    System.out.print("\033\143");
                    System.out.println("=====ERRORE=====\nHai inserito [" + m2 + "]");
                    System.out.println("Non puoi inserire un ora superiore a 59\nScrivi direttamente 0");
                    System.out.println("=====[" + h2 + "]=[]=[]=====");
                    System.out.print("Inserisci i minuti del primo orologio ");
                    m2 = reader.nextInt();
                } else {
                    loop = 0;
                }
            }
            System.out.println("=====h[" + h2 + "]=m[" + m2 + "]=s[]=====");
            System.out.print("Inserisci i secondi del primo orologio ");
            s2 = reader.nextInt();
            loop = 1;
            while (loop == 1) {
                if (s2 > 59) {
                    System.out.print("\033\143");
                    System.out.println("=====ERRORE=====\nHai inserito [" + s2 + "]");
                    System.out.println("Non puoi inserire un ora superiore a 59\nScrivi direttamente 0");
                    System.out.println("=====[" + h2 + "]=[" + m2 + "]=[]=====");
                    System.out.print("Inserisci i secondi del primo orologio ");
                    s2 = reader.nextInt();
                } else {
                    loop = 0;
                }
            }
            System.out.print("\033\143");
            System.out.println("Orologio n°1 settato ad [" + h1 + "]:[" + m1 + "]:[" + s1 + "]");
            System.out.println("Orologio n°2 settato ad [" + h2 + "]:[" + m2 + "]:[" + s2 + "]");
            System.out.println("===================");
            // CONTROLLO
            if (h1 == h2) {
                if (m1 == m2) {
                    if (s1 == s2) {
                        System.out.println("I due orari combaciano");
                    } else if (s2 < s1) {
                        System.out.println("Il secondo viene prima del primo");
                    } else {
                        System.out.println("Il primo viene prima del secondo");
                    }
                } else if (m2 < m1) {
                    System.out.println("Il secondo viene prima del primo");
                } else {
                    System.out.println("Il primo viene prima del secondo");
                }
            } else if (h2 < h1) {
                System.out.println("Il secondo viene prima del primo");
            } else {
                System.out.println("Il primo viene prima del secondo");
            }
            System.out.println("===================");

        } finally {
            reader.close();
        }
    }
}
