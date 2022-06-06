package oop.persona;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Mario", "Bianchi");
        Persona persona2 = new Persona("Renato", "Caputo", "Sig", "Barbiere");
        System.out.println(persona1.infoPersona());
        System.out.println(persona2.infoPersona());
        persona1.setTitolo("Ing");
        persona1.setProfessione("Analista Programmatore");
        System.out.println(persona1.infoPersona());

    }
}
