package cn.itcast8.Static;

public class Test {
    public static void main(String[] args) {
        ReverseArray.show();

        int a = 10;
        int b = 20;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("----------");
        int[] arr = {1,6,4,5,2,3};
        for (int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
        ReverseArray.reverse(arr);
        System.out.println("----------------------");
        for (int i = 0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println(ReverseArray.num2);
        ReverseArray r = new ReverseArray();
        r.show();
    }
}
