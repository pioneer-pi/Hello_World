package normal_code.P11Thread;

//实现线程的第一种方式
public class Thread1 {
    public static void main(String[] args) {
        //main方法 属于主线程
        MyThread myThread = new MyThread();
        myThread.start();//start方法作用:在JVM种开辟一个新的栈空间，这段代码任务完成后瞬间结束
        //这段代码任务只是为了开启一个新的栈空间
        //启动成功的线程会自动调用run方法 并且run方法在分支栈的底部 main在主栈的栈底部
        //直接run的话不会启动线程，不会分配新的分支栈
        for (int i = 0;i < 1000;i++){
            System.out.println("主线程-->"+i);
        }
    }
}
class MyThread extends Thread{
    @Override
    public void run(){
        //这段程序运行在分支栈种
        for (int i=0;i<1000;i++){
            System.out.println("分支线程--->" + i);
        }
    }
}