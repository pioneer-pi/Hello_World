package cn.itcast2.pioneer;

import java.util.Scanner;

public class MethodsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the value of a: ");
        int a = sc.nextInt();
        System.out.println("Please input the value of b: ");
        int b = sc.nextInt();
        System.out.println(compare(a, b));
    }

    public static int sum(int a, int b) {
        int c = a + b;
        return c;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static boolean compare(int a, int b) {
        return a == b;
    }
}
