package normal_code.P13Executor;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompleteFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> c = CompletableFuture.supplyAsync(() ->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
            return 5;
        }).thenApply(x -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
            return x + 1;
        }).thenApplyAsync(x -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
            return x + 1;
        });
        CompletableFuture.allOf(c);
        System.out.println(c.get());


        CompletableFuture<Integer> b = CompletableFuture.supplyAsync(() -> 5)
                .thenApply(x -> x + 1)
                .thenApplyAsync(x -> x + 1);
        CompletableFuture.allOf(b);
        System.out.println(b.get());
    }
}
