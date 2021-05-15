package experiment.Experiment6;

//8691
import javafx.scene.chart.ScatterChart;

import java.util.Scanner;
public class Number_one {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(10 - n);
        } catch(Exception e){
            System.out.println("not int");
        }finally{
            System.out.println("end");
        }
    }

}
