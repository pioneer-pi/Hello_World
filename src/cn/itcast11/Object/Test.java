package cn.itcast11.Object;
import java.lang.Object;
public class Test extends Object{
    public static void main(String[] args) {
        //非静态方法需要创建对象来调用
        //java.lang下的类可以直接使用


        //测试hashCode();
        Object obj1 = new Object();
        Object obj2 = new Object();

        int code1 = obj1.hashCode();
        int code2 = obj2.hashCode();
        System.out.println(code1);
        System.out.println(code2);

        System.out.println("-----------");
        //Class<?> get Class();
        Class claz1 = obj1.getClass();
        Class claz2 = obj2.getClass();
        System.out.println(claz1);
        System.out.println(claz2);
        System.out.println("--------------");

        //toString() : 默认打印的是地址值
        //           地址值的组成：全类名 + @ + 该对象哈希码的无符号十六进制形式
        String s1 = obj1.toString();
        String s2 = obj2.toString();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println("-----------------");

        //boolean equals() 默认比较地址值 无意义 子类一般重写
        boolean b1 = obj1.equals(obj2);
        System.out.println(b1);
    }
}