package cn.itcast.demo;

public class OperatorDemo3 {
    public static void main(String[] args) {
        int a = 5;
//        a++;
//        System.out.println("a:" + a);//单独使用

        int b = a++;
        System.out.println("a:" + a);
        System.out.println("b:" + b);//++在后,先操作在自增

        int c = ++a;
        System.out.println("a: " + a);
        System.out.println("c: " + c);

    }
}
