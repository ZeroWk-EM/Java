package interfaces.wild;

import interfaces.wild.Animals.*;

public class Main {
    public static void main(String[] args) {
        Fish nemo = new Fish("Tonno", 2, true, 12, 2);
        Lion sauron = new Lion("Leone delle montagne", 2, true, 200, 50);
        Snake lucifero = new Snake("Mamba Nero", 2, true, 3.50, true);

        System.out.println(nemo);
        System.out.println(sauron);
        System.out.println(lucifero);

        nemo.runAway();
        sauron.gotoPrey();
        lucifero.gotoPrey();

        System.out.println(nemo.swimm());
    }
}
