package cn.itcast1.demo;

public class DoWhileDemo2 {
    public static void main(String[] args) {
        //三种循环打印1-5
        System.out.println("For循环：");
        for(int i = 1; i <= 5;i++){
            System.out.println(i);
        }
        System.out.println("--------------------");
        System.out.println("While循环: ");
        int i = 1;
        while(i <= 5){
            System.out.println(i);
            i++;
        }
        System.out.println("---------------------");
        System.out.println("DoWhile循环");
        int b = 1;
        do{
            System.out.println(b);
            b++;
        }while(b<=5);

    }
}
