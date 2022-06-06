package oop.bankAccount;

public class BankAccount {
    private int balance;

    BankAccount(int x) {
        if (x < 0) {
            this.balance = 0;
        } else {
            this.balance = x;
        }
    }

    public void deposit(int x) {
        this.balance += x;
    }

    public void take(int x) {
        if (x > this.balance) {
            System.out.println("== ERROR ==");
        } else {
            this.balance -= x;
        }
    }

    public int belance() {
        return this.balance;
    }

}
