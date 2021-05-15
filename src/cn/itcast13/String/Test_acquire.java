package cn.itcast13.String;

import org.w3c.dom.ls.LSOutput;

public class Test_acquire {
    public static void main(String[] args) {
        String str = "pioneer wyp pioneer";
        //int length()
        System.out.println("length: " + str.length());
        //char charAt(int)
        System.out.println("第0个位置的字符:" + str.charAt(0));
        //int indexOf(String)
        System.out.println(str.indexOf("w"));
        //int lastIndexOf(String)
        System.out.println(str.lastIndexOf("p"));
        //String substring(int,int)
        System.out.println(str.substring(5,11));
    }
}
