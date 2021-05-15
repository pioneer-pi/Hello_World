package cn.itcast1.demo;

//键盘录入两个整数 求和;
import java.util.Scanner;
public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入a的值： ");
        int a = sc.nextInt();
        System.out.println("请输入b的值： ");
        int b = sc.nextInt();

        System.out.println("a + b 的值为：" + (a + b));

    }
}
