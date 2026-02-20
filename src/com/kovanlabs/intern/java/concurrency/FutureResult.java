package com.kovanlabs.intern.java.concurrency;

import java.util.concurrent.*;

public class FutureResult {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();

        Callable<Integer> callable = ()-> {
            System.out.println("Calculation started... ");
            Thread.sleep(5000);
            return 50+50;
        };

        Future<Integer> future = service.submit(callable);

        System.out.println("Main thread is doing other work...");

        for(int i=0; i<3; i++){
            try {
                Thread.sleep(1000);
                System.out.println("Main thread is working");
            } catch (InterruptedException e) {
                System.out.println("Main thread gets interrupted");
            }
        }

        try {
            int result = future.get(1,TimeUnit.SECONDS);
            System.out.println("Result: "+result);
        }
        catch (TimeoutException e) {
            System.out.println("Thread taking too long");
            future.cancel(true);
        }
        catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        service.shutdown();

    }
}
