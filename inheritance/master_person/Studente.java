package inheritance.master_person;

public class Studente extends Persona {
    // Matricola
    private int id;
    private String universityName;

    Studente(String codiceFiscale, String nome, String cognome, int id, String universityName) {
        super(codiceFiscale, nome, cognome);
        setId(id);
        setUniversityName(universityName);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public int getId() {
        return id;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void visualizzaStudente() {
        System.out.println("Codice fiscale: " + getCodiceFiscale() + " Nome: " + getNome() + " Cognome: " + getCognome()
                + " Matricola: " + id + " Universita degli studi di: " + universityName);
    }

}
