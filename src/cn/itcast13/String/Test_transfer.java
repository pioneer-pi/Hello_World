package cn.itcast13.String;

public class Test_transfer {
    public static void main(String[] args) {
        String s1 = "abc";
        //byte[] getBytes()
        byte[] byt = s1.getBytes();
        for (int i = 0;i < byt.length;i++) {
            System.out.println(byt[i]);
        }
        System.out.println("--------------");
        //charp[] toCharArray()
        char[] ch = s1.toCharArray();
        for (int i =0;i < ch.length;i++){
            System.out.println(ch[i]);
        }
        System.out.println("------------");

        //static String valueOf(..);
        String s2 = String.valueOf(123);
        System.out.println("s2:" + s2 + 4 );

        String s3 = "" + 123;
        System.out.println(s3 + 4);
        System.out.println("--------------");

        //String replace(old,new)
        String s4 = "abc abc abc";
        String s5 = s4.replace("abc","adc" );
        System.out.println(s5);
        System.out.println("---------------------");
        //String[] split(String)
        String[] arr = s4.split(" ");
        for (int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("------------------");
        //String trim();
        String s6 = "  a  b  c  ";
        String s7 = s6.trim();
        System.out.println(s7);
    }
}
