package inheritance.garage;

public class Main {
    public static void main(String[] args) {
        Garage portosalvo = new Garage(5, 10, 1);

        Veichle macchina = new Car(1990, "Audi", "Disel", 8, 5);
        Veichle moto = new Bike(2012, "Tmax", "Benzina", 2, "Sportiva", 4);
        Veichle cargo = new Rugged(2005, "Fiorino", "Gas", 12, 1200);

        System.out.println("Capienza massima ["+portosalvo.getMax()+"]");
        

    }
}
