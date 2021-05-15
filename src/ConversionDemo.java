public class ConversionDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);

        System.out.println("-----------------");
        int aa = 10;
        byte bb = 20;
        System.out.println(aa + bb);
        //byte cc = aa + bb;
        int cc = aa + bb;//隐式类型转换
        System.out.println(cc);
        System.out.println("-----------------");
        byte dd = (byte)(aa + bb);//强制类型转换，转换过程可能出现精度丢失;
        System.out.println(dd);
        System.out.println("-------------");

        double d1 = 3.14;
        int a1 = (int)d1; // 将double类型结果强制转换成int；
        System.out.println(a1);
    }
}
