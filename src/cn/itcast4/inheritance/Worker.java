package cn.itcast4.inheritance;

public class Worker extends Person {
    public Worker() {
        //super(); //默认代码
        super("pioneer");
        System.out.println("Worker类的空参构造");
    }
}
