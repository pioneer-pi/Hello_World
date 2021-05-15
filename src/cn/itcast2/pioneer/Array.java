package cn.itcast2.pioneer;


public class Array {
    public static void main(String[] args) {
        int[] arr = {2,4,5,3,5,9};
        System.out.println("arr: ");
        printArray(arr);
        System.out.println("-------------");
        int[] arr2 = acquireArray();
        System.out.println("arr2: ");
        printArray(arr2);
    }
    //打印数组
    public static void printArray(int[] arr){
        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
        return ;
    }
    public static int[] acquireArray(){
        int[] arr = {1,2,3};
        return arr;
    }
}