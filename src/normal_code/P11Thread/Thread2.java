package normal_code.P11Thread;

/*实现线程的第二个方法
编写一个类实现Runnable接口
*/
public class Thread2 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
    }
}
class MyRunnable implements Runnable{
    @Override
    public void run(){

    }
}
