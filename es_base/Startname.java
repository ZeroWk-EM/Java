package es_base;

import java.util.Scanner;

public class Startname {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            System.out.println("Insersci il nome");
            String name = reader.nextLine();
            System.out.println("Inserisci il cognome");
            String surname = reader.nextLine();
            System.out.println("Buongiorno [" + name.charAt(0) + "." + surname.charAt(0) + "]");
        } finally {
            reader.close();
        }
        ;
    }
}
