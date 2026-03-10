package com.kovanlabs.intern.java.fridaychallenge.multithreadingbank;

import java.util.*;

public class BankSimulation {

    public static void main(String[] args) throws InterruptedException {

        List<Account> accounts = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            accounts.add(new Account(i, 1000));
        }

        TransactionEngine engine = new TransactionEngine(accounts);

        System.out.println("Starting transactions...");

        engine.startTransactions();

        double total = 0;

        for (Account acc : accounts) {
            total += acc.getBalance();
        }

        System.out.println("Final Total Balance: $" + total);
    }
}
