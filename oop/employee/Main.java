package oop.employee;

public class Main {
    public static void main(String[] args) {
        Employee emanuele = new Employee("Emanuele", 1500);
        Employee guglielmo = new Employee();

        guglielmo.setName("Guglielmo");
        guglielmo.setAmount(1800);

        System.out.println("Stipendio base di " + emanuele.getName() + " = [" + emanuele.getAmount() + "]");
        System.out.println("Stipendio base di " + guglielmo.getName() + " = [" + guglielmo.getAmount() + "]");

        System.out.println(
                "Siccome Emanuele e' un ottimo lavoratore avra un aumento del 40%\nGuglielmo ricevera un'aumeto del 10%...perchè si");
        emanuele.raiseSalary(40.0);
        guglielmo.raiseSalary(10.0);

        System.out.println("Stipendio dopo l'aumento di " + emanuele.getName() + " = [" + emanuele.getAmount() + "]");
        System.out.println("Stipendio dopo l'aumento di " + guglielmo.getName() + " = [" + guglielmo.getAmount() + "]");

    }
}
