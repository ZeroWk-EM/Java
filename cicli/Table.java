package cicli;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            System.out.println("=== TABELLINA ===");
            System.out.print("Di quale numero vuoi la tabellina ");
            int num = reader.nextInt();
            int ris = 0;
            for (int i = 0; i <= 10; i++) {
                ris = num * i;
                System.out.println("[" + num + "] x [" + i + "] = [" + ris + "]");
            }
        } finally {
            reader.close();
        }
    }
}
