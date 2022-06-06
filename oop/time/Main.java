package oop.time;

public class Main {
    public static void main(String[] args) {
        // Creazione primo orario
        T time1 = new T(20, 46, 58);
        // Orario normale
        System.out.println("==== Orario normale ====");
        System.out.println("Primo orario " + time1.hour + ":" + time1.minute + ":" + time1.second);

        System.out.println("==== Somma orario ====");
        time1.timeAdd(45, 15, 88);
        System.out.println("Primo orario " + time1.hour + ":" + time1.minute + ":" + time1.second);
        System.out.println("==== Sottrazione orario ====");
        time1.timeAdd(50, 180, 300);
        System.out.println("Secondo orario " + time1.hour + ":" + time1.minute + ":" + time1.second);

    }
}
