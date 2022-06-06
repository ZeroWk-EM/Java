package oop.scouteer;

public class Main {
    public static void main(String[] args) {
        Motorino tmax = new Motorino("Nero");
        tmax.accelleraMotore(20);
        System.out.println("------- SPEGNIMENTO ALLARME -------\n");
        tmax.switchAllarme(false);
        tmax.accelleraMotore(50);
        System.out.println("-------- ACCENSIONE MOTORE --------\n");
        tmax.switchMotore(true);
        tmax.accelleraMotore(100);
        tmax.accelleraMotore(56);
        tmax.accelleraMotore(100);

    }
}
