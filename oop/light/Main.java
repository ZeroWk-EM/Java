package oop.light;

public class Main {
    public static void main(String[] args) {
        Lampadina lights = new Lampadina(6);

        lights.click();
        lights.click();
        lights.click();
        lights.click();
        lights.click();
        lights.click();
        lights.click();

        System.out.print("Le luci sono ");
        if (lights.state() == -1)
            System.out.println("ROTTE");
        else if (lights.state() == 0)
            System.out.println("SPENTE");
        else if (lights.state() == 1)
            System.out.println("ACCESSE");
    }
}
