package tutorial;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // ACCETTANO SOLO REFERENCE NO VALORI PRIMITIVI
        ArrayList<String> persone = new ArrayList<String>();
        persone.add("Luca");
        persone.add("Marco");
        persone.add("Sara");

        System.out.println("==========STAMPA INLINE==========");
        System.out.println(persone.get(0) + " " + persone.get(1) + " " + persone.get(2));

        System.out.println("==========STAMPA CON CICLO==========");
        for (int i = 0; i < persone.size(); i++) {
            System.out.print("[" + persone.get(i) + "] ");
        }
        System.out.println("\n==========.set()=========="); // Andiamo a modificare il contenuto dell'indice scelto
        System.out.println("Prima [" + persone.get(1) + "]");
        persone.set(1, "Giulia");
        System.out.println("Andiamo a mettere Giulia a posto di Marco");
        for (int i = 0; i < persone.size(); i++) {
            System.out.print("[" + persone.get(i) + "] ");
        }
        System.out.println("\n==========.remove()=========="); // Togliamo un elemento
        persone.remove(0);
        for (int i = 0; i < persone.size(); i++) {
            System.out.print("[" + persone.get(i) + "] ");
        }
        System.out.println("\n==========.clear()=========="); // Togliamo TUTTI GLI elementi
        persone.clear();
        for (int i = 0; i < persone.size(); i++) {
            System.out.print("[" + persone.get(i) + "] ");
        }
        System.out.println("\nNon stampa nulla perche ormai l'array e' vuoto");

    }
}
