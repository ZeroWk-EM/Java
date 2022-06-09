package inheritance.veichle;

public class Main {
    public static void main(String[] args) {
        Veichle generico = new Veichle(5, 10, 4);
        Truck camion_grande = new Truck(3, 100, 2, 5, false);

        System.out.println(generico.getPassengers());
        System.out.println(camion_grande.getAlarm());

    }
}
