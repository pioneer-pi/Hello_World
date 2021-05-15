package normal_code.P12Concurrency;

import javax.swing.*;
import java.util.concurrent.CountDownLatch;

public class Test {
    public static void main(String[] args) throws InterruptedException {

//        int count = 1800;
////        Account a = new Account();
////        CountDownLatch latch = new CountDownLatch(count);
////        for (int i = 0;i < count/2;i++) {
////            new Thread(() -> {
////                a.addA();
////                latch.countDown();
////            }).start();
////        }
////        for (int i = 0;i < count/2;i++){
////            new Thread(() -> {
////                a.addB();
////                latch.countDown();
////            }).start();
////        }
////        latch.await();
////        System.out.println(a.getA());
////        System.out.println(a.getB());
        int count = 8000;
        CountDownLatch latch = new CountDownLatch(count);
        for (int i =0;i < count;i++){
            new Thread(() -> {
                Counter.increment();
                latch.countDown();
            }).start();
        }
        latch.await();
        System.out.println(Counter.getC());
        }
    }
