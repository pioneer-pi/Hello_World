package cn.itcast1.demo;

import java.util.Scanner;
public class IfDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入当前的时间：");
        int time = sc.nextInt();
        if(0 <= time && time <=12){
            System.out.println("上午好");
        }
        else if(13 <= time && time <= 18){
            System.out.println("下午好");
        }
        else if(19 <= time && time <= 24){
            System.out.println("晚上好");
        }
        else {
            System.out.println("我不认识这个数字");
        }
    }
}
