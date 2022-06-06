package oop.car;

public class Main {
    public static void main(String[] args) {
        Car bwm = new Car(20);
        System.out.println("Carburante iniziale [" + bwm.getGas() + "]");
        bwm.addGas(300);
        System.out.println("Carburante dopo il rifornimento [" + bwm.getGas() + "]");
        bwm.drive(47);
        System.out.println("Carburante dopo aver fatto della strada [" + bwm.getGas() + "]");
    }
}
