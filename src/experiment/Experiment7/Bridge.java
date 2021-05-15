package experiment.Experiment7;

public class Bridge {
    public synchronized void run(){
        try {
            System.out.println(Thread.currentThread().getName()+"正在过桥");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
