package inheritance.master_person;

public class Main {
  public static void main(String[] args) {
    Studente emanuele = new Studente("MNCVE425HM0882", "Emanuele", "Moncada", 100006186, "Catania");
    Docente alberto = new Docente("ALBSUBDET40991", "Alberto", "Longo", "Java", 10000);

    emanuele.visualizzaStudente();
    alberto.visualizzaDocente();

  }
}
