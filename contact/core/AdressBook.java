package contact.core;

import java.util.*;

public class AdressBook {
    private List<User> contatti;

    public AdressBook() {
        this(new ArrayList<>());
    }

    // Questa da un'inizializzazione di base alla lista
    public AdressBook(int size) {
        this.contatti = new ArrayList<>(size);
    }

    // Qui li passiamo una lista già esistente
    public AdressBook(List<User> contatti) {
        this.contatti = contatti;
    }

    public boolean addUser(String name, String surname, String number) {
        User newuser = new User(name, surname, number);
        // Aggiunge l'oggetto appena creato alla lista chiamata contatti e controlla se
        // non esiste un duplicato
        if (!contatti.contains(newuser)) {
            // Verifica se l'operazione è andata a buon fine
            return contatti.add(newuser);
        }
        return false;
    }

    public boolean removeUser(String name, String surname) {
        User removeableuser = new User(name, surname);
        // Crea un oggetto che si andra a conforntare con quello esistente in lista
        return contatti.remove(removeableuser);
    }

    public String searchUser(String name, String surname) {
        User searchableuser = new User(name, surname);
        // Metodo tramite indexof
        int userindex = contatti.indexOf(searchableuser);
        if (userindex != -1) {
            return contatti.get(userindex).getNumber();
        }
        return null;

        /* Metodo tramite ciclo for
         * for (User user : contatti) {
         * if (user.equals(searchableuser)) {
         * return user.getNumber();
         * }
         * }
         * return null;
         */
    }

    public int lenghtBook() {
        return contatti.size();
    }

    @Override
    public String toString() {
        return "Rubrica \n" + contatti;
    }
}
