package cn.itcast1.demo;

import java.util.Scanner;
import java.util.Random;
public class RandomDemo2 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        boolean guess = false;

        while(!guess){
            System.out.println("请输入你猜想的数字:");
            int guess_num = sc.nextInt();
            if(guess_num > num){
                System.out.println("Your number is big.");
            }
            else if(guess_num < num){
                System.out.println("Your number is little");
            }
            else{
                System.out.println("You are right");
                guess = true;
            }
        }
        return ;
    }
}