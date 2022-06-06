package oop.bankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount emanm = new BankAccount(0);
        System.out.println(emanm.belance());
        emanm.deposit(1000);
        emanm.take(400);
        emanm.take(500);
        System.out.println(emanm.belance());

    }

}
