package cn.itcast10.Interface;

public interface USB {
    public static final int num = 10;

    //JDK7及其以前的写法
    public abstract void open();
    public abstract void close();
    //JDK8多了两种写法
    public static void methon1(){
        System.out.println("我是JDK8的新特性");
    }
    public default void methon2(){
        System.out.println("我是JDK8的新特性");
    }

    private void method3(){
        System.out.println("我是JDK8的新特性");
    }
}
