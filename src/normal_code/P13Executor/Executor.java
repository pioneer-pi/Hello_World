package normal_code.P13Executor;

import javax.swing.*;
import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (int i = 0;i < 10; i++){
            service.execute(() ->{
                try {
                    Thread.sleep(500);
                    System.out.println(Thread.currentThread().getName() + "/" + LocalTime.now());
                } catch (InterruptedException ignored) {
                    System.out.println("被中断");
                }
            });
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        service.shutdown();
    }
}