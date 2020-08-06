package org.xpdojo.bank;

public class Account {

    private int balance = 0;

    public int balance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (amount > balance) {
            throw new RuntimeException("Cannot withdraw - no overdraft available");
        } else {
            balance -= amount;
        }

    }

}
