package cicli;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            System.out.println("Sequenza di FIBONACCI");
            int num1 = 0;
            int num2 = 1;
            int ris;
            System.out.print("Quanti numeri vuoi stampare? ");
            int len = reader.nextInt();
            System.out.print("[" + num1 + "][" + num2 + "]");
            for (int i = 2; i < len; i++) {
                ris = num1 + num2;
                System.out.print("[" + ris + "]");
                num1 = num2;
                num2 = ris;
            }
        } finally {
            reader.close();
        }

    }
}
