package abstracts;

public class Main {
    public static void main(String[] args) {
        Veichle macchina = new Car("SSD 102 YUS", "Audi", "A9", 5, 4);
        Veichle motore = new Bike("XRS 696 YXS", "Renault", "Megane", 5, 2);
        Veichle camion = new Rugged("SXS 999 YLS", "Peguot", "GT SPORT", 2, 200.50);

        macchina.accendi();
        System.out.println(macchina);

        motore.accendi();
        System.out.println(motore);

        camion.accendi();
        System.out.println(camion);

    }
}
