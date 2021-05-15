package normal_code.L6;

import java.sql.SQLOutput;

public class p5 {
    public static void main(String[] args) {
        //euqals比较值 == 比较地址
//        String str1 = "hello world";
//        String str2 = "hello world";
//        String str3 = new String("hello world");
//        System.out.println(str1==str3);
//        System.out.println(str1.equals(str3));
//        String str = "110";
//        int num = Integer.parseInt(str);
//        double dnum = Double.parseDouble(str);

        //字符串类型转换
//        int num = 110;
//        String str2 = Integer.toString(num);
//        String str3 = String.valueOf(num);
//        System.out.println(str3.getClass());
        //String 常用操作
//        String simple = "Hello World";
//        String simToLowCase = simple.toLowerCase();
//        simple.trim();//去掉空格
//        String simToUpperCase =simple.toUpperCase();
//        System.out.println(simple.substring(6));
//        System.out.println(simple.substring(0,5));
//        //index
//        String fileName = "Lecture01.pptx";
//        System.out.println(fileName.indexOf("1"));
//        System.out.println(fileName.lastIndexOf("1"));
//        System.out.println(fileName.indexOf("t"));
//        System.out.println(fileName.lastIndexOf("t"));

        //replace and replace All
//        String str = "2018/10/10 08:30";
//        String str1 = str.replaceAll("/","-").replaceAll(":",":");
//        System.out.println(str1);
//        StringBuilder builder = new StringBuilder();
        int n = 100_000;
        long start1 = System.nanoTime();
        String msg = "";
        for (int i =0;i< n;i++){
            msg = msg +"student_id" +i;
        }
        long end1 = System.nanoTime();
        System.out.println(end1-start1);

        long start2 = System.nanoTime();
        StringBuilder builder = new StringBuilder();
        for (int i =0;i<n;i++){
            builder.append("student_id"+i);
        }
        String msg2 = builder.toString();
        long end2 = System.nanoTime();
        System.out.println(end2-start2);
    }
}
