package inheritance.garage;

public class Main {
    public static void main(String[] args) {

        Garage portosalvo = new Garage(1, 1, 1);

        Veichle macchina = new Car("AAS 345 FG3", 1990, "Audi", "Disel", 8, 5);
        Veichle moto = new Bike("LLO 112 8RJ", 2012, "Tmax", "Benzina", 2, "Sportiva", 4);
        Veichle cargo = new Rugged("DDT 109 KKP", 2005, "Fiorino", "Gas", 12, 1200);

        System.out.println("POSTI TOTALI [" + portosalvo.getMax() + "]\n");
        portosalvo.garageStatus();

        portosalvo.addVeichle(macchina);
        portosalvo.addVeichle(moto);
        portosalvo.addVeichle(cargo);
    }
}
