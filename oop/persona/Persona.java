package oop.persona;

public class Persona {
    private String nome;
    private String cognome;
    private String titolo;
    private String professione;

    public Persona(String nome, String cognome, String titolo, String professione) {
        this.nome = nome;
        this.cognome = cognome;
        setTitolo(titolo);
        setProfessione(professione);
    }

    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        this.titolo = " ";
        this.professione = "Dissocupato";
    }

    public String infoPersona() {
        return this.nome + "" + this.cognome + "" + this.titolo + "" + this.professione;
    }

    public void setProfessione(String professione) {
        this.professione = professione;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
}
