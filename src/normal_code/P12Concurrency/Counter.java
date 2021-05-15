package normal_code.P12Concurrency;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
//    private Random r = new Random();
//    private int c;
//    public void increment(){
//        try{
//            Thread.sleep(r.nextInt(50));
//            c ++;
//        }catch (InterruptedException i ){
//            i.printStackTrace();
//        }
//    }
    public static int getC(){
        return c;
    }
//    public synchronized void incrementSync(){
//        try{
//            Thread.sleep(r.nextInt(50));
//            c++;
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
//    }
    private static int c = 0;
    private static final Random r = new Random();
    private static final Lock lock = new ReentrantLock();
    public static void increment(){
        try{
            Thread.sleep(r.nextInt(50));
            lock.lock();
            c++;
        }catch (InterruptedException ignored){

        }finally{
            lock.unlock();
        }
    }
}
