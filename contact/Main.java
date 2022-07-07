package contact;

import contact.core.*;

public class Main {
    public static void main(String[] args) {
        /*
         * Questo costruttore creera una lista vuota
         * perché chiamera il primo costruttore
         */
        AdressBook adBook = new AdressBook();

        // Controlla se il contatto è stato aggiunto con successo
        boolean isAdded = adBook.addUser("Emanuele", "Moncada", "3498582464");
        if (isAdded) {
            System.out.println("Contatto aggiunto con successo");
        } else {
            System.out.println("Errore nell'aggiunta del contatto");
        }

        // Esegue la ricerca di contatto tramite Nome e Cognome
        String number = adBook.searchUser("Emanuele", "Moncada");
        if (number != null) {
            System.out.println("Il numero di telefono assocciato e' [" + number + "]");
        } else {
            System.out.println("Contatto non presente in rubrica");
        }

        // Controlla se il contato e stato rimosso con successo
        boolean isRemove = adBook.removeUser("Guni", "Moncada");
        if (isRemove) {
            System.out.println("Contatto rimosso con successo");
        } else {
            System.out.println("Contatto non presente in rubrica, controllare i dati inseriti ");
        }

        // Restituisce la lunghezza della rubrica
        System.out.println(adBook.lenghtBook());
    }
}
