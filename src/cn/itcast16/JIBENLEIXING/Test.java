package cn.itcast16.JIBENLEIXING;

public class Test {
    public static void main(String[] args) {
        int a = 10;
        //装箱
        Integer i1 = new Integer(a);
        //拆箱
        int b = i1.intValue();
        System.out.println("--------------");

        //JDK5的新特性，自动拆装箱
        Integer i2 = 30; //装箱
        int c = i2;     //拆箱
        System.out.println("--------------------");
        //static parseInt()
        String s = "10";
        int num = Integer.parseInt(s);
        System.out.println(num);
    }
}
