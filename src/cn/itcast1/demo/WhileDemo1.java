package cn.itcast1.demo;

public class WhileDemo1 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while(i <= 100){
            sum += i;
            i++;
        }
        System.out.println("The sum of first 100 number: " + sum);
    }
}
