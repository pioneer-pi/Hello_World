package cn.itcast12.Scanner;

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        //System.in: 标准的输入流，默认指向键盘
        Scanner sc = new Scanner(System.in);

        System.out.println("请录入一个整数: ");
        //为了避免InputMismatchException异常，可以加入一个判断
//        if(sc.hasNextInt()) {
//            int num = sc.nextInt();
//            System.out.println("num: " + num);
//        }
//        System.out.println("字符串:");
//        String str1 = sc.nextLine();
//        System.out.println("str1: "+str1);
//        String str2 = sc.next();
//        System.out.println("str2: " + str2);

        String a = "pioneer";
        System.out.println(a.startsWith("p"));
    }
}
