package normal_code.P11Thread;

import java.util.ArrayList;
import java.util.List;

/*
使用wait 和 notify 实现 生产者和消费者模式
生产线程负责生产，消费线程负责消费
生产线程和消费线程达到均衡

wait 和 notify 方法不是线程对象方法 是 object对象的 方法

wait 和 notify 方法建立在线程同步的基础上

wait 方法 o.wait 让正在o对象上活动的线程进入等待状态 并释放掉 占有的锁
notify 不会释放锁
 */
public class Thread8 {
    public static void main(String[] args) {
        //创建一个仓库对象
        List list = new ArrayList();

        Thread t1 = new Thread(new Producer(list));
        Thread t2 = new Thread(new Consumer(list));

        t1.setName("生产者线程：");
        t2.setName("消费者线程：");
        t1.start();
        t2.start();
    }
}
//生产线程
class Producer implements  Runnable{
    private List list;

    public Producer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        //一直生产
        while (true) {
            //给仓库对象list加锁
            synchronized (list) {
                if (list.size() > 0) {
                    //当前线程等待状态
                    try {
                        //释放掉list的锁
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //走到这说明仓库为空
                Object obj = new Object();
                list.add(obj);
                System.out.println(Thread.currentThread().getName() + "--->" + obj);
                //唤醒消费者
                list.notify();
            }
        }
    }
}
//消费线程
class Consumer implements  Runnable{
    private List list;

    public Consumer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        //一直消费
        while(true) {
            synchronized (list) {
                if (list.size() == 0){
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Object obj = list.remove(0);
                System.out.println(Thread.currentThread().getName() + "-->" +  obj);
                //唤醒生产者
                list.notify();
            }
        }
    }
}
