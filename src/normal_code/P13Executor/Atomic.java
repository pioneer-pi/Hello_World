package normal_code.P13Executor;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Atomic {
    private static final Random r = new Random();
    private static AtomicInteger c= new AtomicInteger(0);
    public static  void increment(){
        try {
            Thread.sleep(50);
            c.incrementAndGet();
        } catch (InterruptedException e) {
        }
    }
    public static int value(){
        return c.get();
    }
}
