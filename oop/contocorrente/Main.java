package oop.contocorrente;

import java.util.Scanner;

public class Main {
    static void menu() {
        System.out.println("1. Esegui versamento");
        System.out.println("2. Esegui prelievo");
        System.out.println("3. Visualizza saldo");
        System.out.println("4. Ultimi cinque movimenti");

    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            boolean loop = true;
            CC mnvcs = new CC(1, "Emanuele", "Moncada", 0);
            System.out.println("============= STJOBS BANK ============");
            System.out.println("=== [" + mnvcs.id + "] == [" + mnvcs.nome + "] == [" + mnvcs.cognome + "] ===");
            do {
                menu();
                System.out.print("Scegli un'operazione ");
                int choice = reader.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("\033[H\033[2J");
                        System.out.println("Quanti soldi vuoi versare");
                        int x = reader.nextInt();
                        mnvcs.deposit(x);
                        System.out.println("===================");

                        break;

                    case 2:
                        System.out.print("\033[H\033[2J");
                        System.out.println("Quanti soldi vuoi prelevare");
                        int y = reader.nextInt();
                        mnvcs.take(y);
                        System.out.println("===================");

                        break;

                    case 3:
                        System.out.print("\033[H\033[2J");
                        System.out.println("Il saldo attuale e' [" + mnvcs.getBalance() + "]");
                        System.out.println("===================");

                        break;

                    case 4:
                        System.out.println("===================");
                        mnvcs.movimenti();
                        System.out.println("===================");
                        break;

                    default:
                        System.out.println("Numero inserito errato");
                        loop = false;
                        break;
                }
            } while (loop);
        } finally {
            reader.close();
        }
    }
}
