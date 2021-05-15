package cn.itcast1.demo;

public class ContinueDemo1 {
    public static void main(String[] args) {
        for(int i = 1;i <= 100;i++){
            if(i%10 == 7 || i%7 == 0 || i/10%10 == 7){
                continue;
            }
            else
                System.out.println(i);
        }
    }
}