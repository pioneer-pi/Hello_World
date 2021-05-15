package normal_code.P11Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

//实现线程得第三种方式 Callable
//优点：可以获取到执行结果
//这种方式的缺点：执行效率变低
public class Thread7 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask task = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {
                System.out.println("call method begin");
                Thread.sleep(1000);
                System.out.println("call method end!");
                int a = 100;
                int b = 200;
                return a + b;
            }
        });
        Thread t = new Thread(task);
        t.start();

        //获取线程执行结果::main方法受阻 这里的main方法想执行必须等待get方法结束
        Object obj = task.get();
        System.out.println("hello world");
    }
}
