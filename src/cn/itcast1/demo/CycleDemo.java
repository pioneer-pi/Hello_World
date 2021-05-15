package cn.itcast1.demo;

import java.util.Scanner;
public class CycleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int count = 0;
        label1:
        for (int i = 1; i <= 3; i++) {
            label2:
            for (int j = 1; j <= 35; j++) {
                if (j % 5 != 0) {
                    System.out.println("正在给第" + i + "个班级的第" + j + "个同学发橙子");
                    count++;
                } else
                    continue label2;
                if (count > 100)
                    break label1;
            }
            System.out.println("----------");
        }
        System.out.println("一共发了" + count + "个橙子");
    }
}
