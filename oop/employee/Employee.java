package oop.employee;

public class Employee {
    private String name;
    private double amount;

    Employee() {

    }

    Employee(String name, double amount) {
        setName(name);
        setAmount(amount);
    }

    String getName() {
        return this.name;
    }

    double getAmount() {
        return this.amount;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAmount(double amount) {
        this.amount = amount;
    }

    void raiseSalary(double byPercent) {
        this.amount = this.amount + ((this.amount * byPercent) / 100);
    }
}
