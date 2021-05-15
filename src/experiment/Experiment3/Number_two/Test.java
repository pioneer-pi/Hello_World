package experiment.Experiment3.Number_two;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入汽车的信息(wheels,weight):");
        int wheels = sc.nextInt();
        int weight = sc.nextInt();
        Vehicle vehicle = new Vehicle(wheels,weight);
        vehicle.show();
        System.out.println("请输入小轿车的信息(wheels,weight,number):");
        wheels = sc.nextInt();
        weight = sc.nextInt();
        int number = sc.nextInt();
        Car car = new Car(wheels,weight,number);
        car.show();
        System.out.println("请输入卡车的信息(wheels,weight,乘客,载货量):");
        wheels = sc.nextInt();
        weight = sc.nextInt();
        number =sc.nextInt();
        int zaihuoliang = sc.nextInt();
        Truck truck = new Truck(wheels,weight,number,zaihuoliang);
        truck.show();

    }
}
