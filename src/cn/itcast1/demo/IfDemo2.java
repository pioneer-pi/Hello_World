package cn.itcast1.demo;


import java.util.Scanner;

public class IfDemo2 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("请输入第一个数的值");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个数的值");
        int number2 = sc.nextInt();

        if(number1 == number2){
            System.out.println("number1 = number2 =" + number1);
        }
        else if(number1 > number2){
            System.out.println("最大值是: " + number1);
        }
        else{
            System.out.println("最大值是: " + number2);
        }
    }
}
