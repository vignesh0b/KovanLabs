package com.kovanlabs.intern.java.fridaychallenge.multithreadingbank;

import java.util.*;
import java.util.concurrent.*;

public class TransactionEngine {

    private List<Account> accounts;
    private Random random = new Random();

    public TransactionEngine(List<Account> accounts) {
        this.accounts = accounts;
    }

    public void startTransactions() throws InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(20);

        for (int i = 0; i < 20; i++) {
            executor.execute(() -> {
                for (int j = 0; j < 1000; j++) {
                    transferRandom();
                }
            });
        }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);
    }

    private void transferRandom() {

        int fromIndex = random.nextInt(accounts.size());
        int toIndex = random.nextInt(accounts.size());

        if (fromIndex == toIndex) return;

        Account from = accounts.get(fromIndex);
        Account to = accounts.get(toIndex);

        double amount = random.nextInt(100);

        transfer(from, to, amount);
    }

    private void transfer(Account from, Account to, double amount) {

        // prevent deadlock by locking in ID order
        Account first = from.getId() < to.getId() ? from : to;
        Account second = from.getId() < to.getId() ? to : from;

        synchronized (first) {
            synchronized (second) {

                if (from.getBalance() >= amount) {
                    from.withdraw(amount);
                    to.deposit(amount);
                }

            }
        }
    }
}
