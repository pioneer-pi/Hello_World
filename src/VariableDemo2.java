import org.w3c.dom.ls.LSOutput;

public class VariableDemo2 {
    /**
     * 数据类型 byte,short,int,long,float,double,
     * char,boolean.
     * 注意事项：1. 定义long后面加L/l
     *          2. 定义float后面加F/f
     */
    public static void main(String[] args) {
        byte b = 10;
        System.out.println(b);

        short s = 20;
        System.out.println(s);

        int i = 30;
        System.out.println(i);

        long l = 10000000000L;
        System.out.println(l);

        float f = 10.3f;
        System.out.println(f);

        double d = 10.2;
        System.out.println(d);

        char c = 'a';
        System.out.println(c);

        boolean b1= true, b2 = false;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println("------------");

        //代码块：变量只在所属范围有效.
        {
            int aa = 20;
            System.out.println(aa);
        }

    }
}
