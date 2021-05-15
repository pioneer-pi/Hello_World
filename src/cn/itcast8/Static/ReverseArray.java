package cn.itcast8.Static;

public class ReverseArray {
    int num1 = 10;
    static int num2 = 20;

    public static void show(){
        System.out.println(num2);
    }
    public static void reverse(int[] arr){
        for(int i=0;i<=arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
    }
}
