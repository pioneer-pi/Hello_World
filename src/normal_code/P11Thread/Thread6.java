package normal_code.P11Thread;
/*
守护线程
 */
public class Thread6 {
    public static void main(String[] args) {
        Thread t = new BakDataThread();
        t.setName("备份数据线程");
        t.setDaemon(true);
        t.start();

        for(int i = 0;i < 10;i++){
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class BakDataThread extends Thread{
    public void run(){
        int i = 0;
        while(true){
            System.out.println(Thread.currentThread().getName() +"-->" + (++i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
