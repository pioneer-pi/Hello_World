package experiment.Experiment6;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Number_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        try {
            triangle(a,b,c);
        }catch (IllegalArgumentException i){
            System.out.println("a,b,c不能构成三角形");
        }
    }
    public static void triangle(int a,int b,int c){
        if (a + b < c || a - b > c || a + c < b || a - c > b || b + c < a ||b - c >a){
            throw new IllegalArgumentException();
        }
        else{
            System.out.println("三角形三个边长为: " + a + "," + b + "," + c);
        }
    }
}
