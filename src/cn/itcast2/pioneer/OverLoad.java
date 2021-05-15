package cn.itcast2.pioneer;

//方法重载
public class OverLoad {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println(compare(a,b));
        long c = 10l;
        long d = 10l;
        System.out.println(compare(c,d));
        double e = 20;
        double f = 20;
        System.out.println(compare(b,d));
    }
    public static boolean compare(int a,int b){
        return a == b;
    }
    public static boolean compare(long a,long b){
        return a == b;
    }
    public static boolean compare(double a,double b){
        return a == b;
    }
}
