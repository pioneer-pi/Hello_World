package cn.itcast.demo;

public class OperatorDemo4 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("a: " + a);
        System.out.println("-------");

        a += 20;
        System.out.println("a: " + a);

        short s = 2;
        //强制类型转换
        s = (short)(s + 1);

        //扩展赋值运算符
        s += 1;
    }
}
