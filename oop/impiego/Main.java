package oop.impiego;

public class Main {
    public static void main(String[] args) {
        Tipolavoro xder = new Tipolavoro();
        Tipolavoro cameriere = new Tipolavoro("Cameriere", 30, 1500.0);

        xder.setNome("Pizzaiolo");
        xder.setOre(10);
        xder.setStipendio(1340.0);

        System.out.println("Tipo lavoro " + xder.getNome());
        System.out.println("Tipo lavoro " + cameriere.getNome());

    }
}
