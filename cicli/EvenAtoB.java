package cicli;

import java.util.Scanner;

public class EvenAtoB {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            int count = 0;
            System.out.print("Inserisci il numero iniziale ");
            int num1 = reader.nextInt();
            System.out.print("Inserisci il numero finale ");
            int num2 = reader.nextInt();
            for (int i = num1; i <= num2; i++) {
                if (i % 2 == 0) {
                    System.out.println("TROVATO [" + i + "]è pari!");
                    count++;
                }
            }
            System.out.println("Ci sono [" + count + "] numeri pari fra [" + num1 + "][" + num2 + "]");
        } finally {
            reader.close();
        }
    }
}
