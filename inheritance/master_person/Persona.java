package inheritance.master_person;

public class Persona {
    private String codiceFiscale;
    private String nome;
    private String cognome;

    Persona(String codiceFiscale, String nome, String cognome) {
        setCodiceFiscale(codiceFiscale);
        setNome(nome);
        setCognome(cognome);
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void visualizzaPersona() {
        System.out.println("Codice fiscale: " + codiceFiscale + " Nome " + nome + " Cognome " + cognome);
    }
}
