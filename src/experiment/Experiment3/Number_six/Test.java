package experiment.Experiment3.Number_six;

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        ComputerAverage average1 = new Gymnastics();
        ComputerAverage average2 = new School();
        Scanner sc = new Scanner(System.in);
        System.out.println("输入数组内数的个数: ");
        int n = sc.nextInt();
        System.out.println("请输入"+n+"个数: ");
        double[] array = new double[n];
        for (int i=0;i<n;i++)
            array[i] = sc.nextDouble();

        System.out.println("Gymnastics: " + average1.average(array));
        System.out.println("School: " + average2.average(array));
    }
}
