package oop.bankWithPassword;

public class BankWithPassword {
    private int balance;
    private int passwd;

    BankWithPassword(int balance, int passwd) {
        setBalance(balance);
        this.passwd = passwd;
    }

    void setBalance(int x) {
        if (this.balance < 0) {
            this.balance = 0;
        } else {
            this.balance = x;
        }
    }

    public boolean checkpasswd(int a) {
        if (a == this.passwd) {
            return true;
        } else {
            return false;
        }
    }

    public int getBalance() {
        return this.balance;
    }

}
