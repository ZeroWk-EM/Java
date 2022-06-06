package tutorial;

public class Overload {
    public static void main(String[] args) {
        int ris = add(10, 30);
        double ris2 = add(30.5, 52.3);
        System.out.println("ADD CON INT[" + ris + "]\nADD CON DOUBLE[" + ris2 + "]"); // La funzione e' sempre la stessa
        // Ma la prima volta usa *1 la seconda volta *2

    }

    // Questa funzione chiamata ADD prendera gli interi
    // *1
    static int add(int a, int b) {
        int ris = a + b;
        return ris;
    }

    // Questa funzione si chiama pure add ma accetta i double anche
    // *2
    static double add(double a, double b) {
        double ris = a + b;
        return ris;
    }

}
