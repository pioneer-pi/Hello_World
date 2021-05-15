package cn.itcast.demo;

public class OperatorDemo2 {
    public static void main(String[] args) {
        //字符的加法运算
        int a = 10;
        char ch = 'a';
        System.out.println(a + ch);

        //字符串的加法运算:字符串参与加法运算不是加法是字符串的拼接；

        System.out.println("hello" + "world");
        System.out.println("hello" + 10);
        System.out.println("hello" + 10 + 20);
        System.out.println(10 + 20 + "hello");
    }
}
