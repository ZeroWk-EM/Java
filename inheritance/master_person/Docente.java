package inheritance.master_person;

public class Docente extends Persona{
    private String subjects;
    private double salary;

    Docente(String codiceFiscale, String nome, String cognome, String subjects, double salary){
        super(codiceFiscale, nome, cognome);
        setSubjects(subjects);
        setSalary(salary);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    public double getSalary() {
        return salary;
    }

    public String getSubjects() {
        return subjects;
    }

    public void visualizzaDocente() {
        System.out.println("Codice fiscale: " + getCodiceFiscale() + " Nome: " + getNome() + " Cognome: " + getCognome() + " Materia: " +subjects+" Salario: "+ salary+" euro");
    }

}
