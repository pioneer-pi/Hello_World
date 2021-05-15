package normal_code.P12Concurrency;

import java.util.Random;

public class Account {
    private int a;
    private int b;
    private final Random r = new Random();

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public synchronized void addA(){
        try {
            Thread.sleep(r.nextInt(50));
            a++;
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public void addB(){
        try {
            Thread.sleep(r.nextInt(50));
            b++;
        }catch (InterruptedException e){
            e.printStackTrace();
        }
}
}
