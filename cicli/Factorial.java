package cicli;

import java.util.Scanner;

public class Factorial {
    static public void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            System.out.println("Inserisci un numero");
            int num = reader.nextInt();
            int fact = 1;
            for (int i = fact; i <= num; i++) {
                fact = fact * i;
            }
            System.out.println("Il fattoriale di [" + num + "] e' [" + fact + "]");
        } finally {
            reader.close();
        }
    }
}
