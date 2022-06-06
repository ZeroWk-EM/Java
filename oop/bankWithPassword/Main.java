package oop.bankWithPassword;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        BankWithPassword bank = new BankWithPassword(0, 1234);
        try {
            System.out.println("Definisci il saldo del primo utene");
            bank.setBalance(reader.nextInt());
            System.out.println("Immetti la password del conto");
            int password = reader.nextInt();
            if (bank.checkpasswd(password)) {
                System.out.println("Password Corretta");
            } else {
                System.out.println("Password Errata");
            }
        } finally {
            reader.close();
        }
    }
}
