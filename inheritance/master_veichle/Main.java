package inheritance.master_veichle;

public class Main {
    public static void main(String[] args) {
        Car auto = new Car("XXX 444 IO", "Renault", "Magane", 5, 4);
        Bike bike = new Bike("SDA 661 PO", "Maxtor", "Tmax", 2, 1000);
        Rugged carro = new Rugged("OOW 999 X1", "Military", "Destructor", 1, 100.0);

        System.out.println("AUTO");
        System.out.println("Targa [" + auto.getLicenze_plate() + "] Brand [" + auto.getBrand() + "] Modello ["
                + auto.getModel() + "] Passeggeri [" + auto.getPassengers() + "] Porte [" + auto.getDoors() + "]");

        System.out.println("Moto");
        System.out.println("Targa [" + bike.getLicenze_plate() + "] Brand [" + bike.getBrand() + "] Modello ["
                + bike.getModel() + "] Passeggeri [" + bike.getPassengers() + "] Cilindrata [" + bike.getCilinder() + "]");

        System.out.println("Autocarro");
        System.out.println("Targa [" + carro.getLicenze_plate() + "] Brand [" + carro.getBrand() + "] Modello ["
                + carro.getModel() + "] Passeggeri [" + carro.getPassengers() + "] Capacita di carico [" + carro.getCargoCapacity() + "] tonnellate");

    }
}
