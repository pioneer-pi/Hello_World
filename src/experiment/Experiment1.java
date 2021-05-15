package experiment;

import java.util.Scanner;
public class Experiment1 {
    public static void main(String args[]){
        Number_seven();
    }

    //1.7193
    public static float Number_one(float f){
        float c;
        c = 5 * (f - 50)/9 + 10;
        System.out.println(c);
        return c;
    }

    //2.7196
    public static double Number_two(int n){
        double i = 1;
        double sum = 0;
        for(int j = 0;j < n;j++,i += 3){
            if (j % 2 == 0){
                sum += 1/i;
            }
            else
                sum -= 1/i;
        }
        System.out.println(sum);
        return sum;
    }

    //3.7197
    public static void Number_three(){
        Scanner sc = new Scanner(System.in);
        int little_year = sc.nextInt();
        int big_year = sc.nextInt();
        for(int i = little_year;i <= big_year;i++){
            if (i%4 == 0 && i%100 != 0 || i%400==0 ||i%3200 == 0){
                System.out.println(i + "是闰年");
            }
        }
    }

    //4.7195
    public static int Number_four(int number) {
        int[] value = new int[4];
        int new_num = 0;
        for(int i = 0;i < 4;i++){
            value[i] = number%10;
            number = number/10;
            value[i] = (value[i] + 9) % 10;
        }
        int temp;
        temp = value[0];
        value[0] = value[2];
        value[2] = temp;
        temp = value[1];
        value[1] = value[3];
        value[3] = temp;

        new_num = value[0] + value[1] * 10 + value[2] * 100 + value[3] * 1000;
        System.out.println(new_num);
        return new_num;
    }

    //5.1464
    public static void Number_five(int[][] array){
        int max = array[0][0];
        int length = 4;
        int wide = 4;
        int position_x = 0;
        int position_y = 0;
        for(int i = 0;i < length;i++){
            for(int j = 0;j < wide;j++){
                if (array[i][j] > max){
                    max = array[i][j];
                    position_x = i + 1;
                    position_y = j + 1;
                }
            }
        }
        System.out.println("最大数的行列值为 (" + position_x  + "," + position_y  +")");
    }

    //6.7194
    public static void Number_six(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入repeat的值: ");
        int repeat = sc.nextInt();
        int a,n;
        for( int r = 0;r < repeat;r++) {
            System.out.println("请输入a的值：");
            a = sc.nextInt();
            System.out.println("请输入b的值：");
            n = sc.nextInt();

            int sum = 0;
            for(int i = 1; i <= n;i++){
                String value = "";
                for(int k = 0;k < i;k++){
                    value += a;
                }
                int integer = Integer.parseInt(value);
                sum += integer;

            }
            System.out.println(sum);
        }

    }

    //7.7186
    public static void Number_seven(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入repeat的值: ");
        int repeat = sc.nextInt();
        int n;
        int temp;
        for(int i = 0;i < repeat;i++){
            System.out.println("请输入n的值: ");
            n = sc.nextInt();
            int[] arr_n = new int[n];

            System.out.println("请输入n个数: ");
            for(int j = 0;j < n;j++){
                arr_n[j] = sc.nextInt();
            }

            for(int k = 0;k < n-1;k++){
                for(int l = k + 1;l < n;l++){
                    if (arr_n[l] > arr_n[k]){
                        temp = arr_n[l];
                        arr_n[l] = arr_n[k];
                        arr_n[k] = temp;
                    }
                }
            }
            for(int o = 0;o < n;o++){
                System.out.println(arr_n[o]);
            }

        }
    }
}
