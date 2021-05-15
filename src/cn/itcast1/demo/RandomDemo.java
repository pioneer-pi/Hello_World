package cn.itcast1.demo;


import java.util.Random;

public class RandomDemo {
    public static void main(String[] args){
        Random r = new Random();
        int num = r.nextInt();
        System.out.println(num);
    }
}