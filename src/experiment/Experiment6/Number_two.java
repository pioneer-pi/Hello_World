package experiment.Experiment6;

import javafx.scene.chart.ScatterChart;

public class Number_two {
    public static void main(String[] args) {
        Chip chip = new Chip();
        Box box1 = new Box(1000);
        Box box2 = new Box(2000);
        Box box3 = new Box(3000);
        try {
            chip.add(box1);
            chip.add(box2);
            chip.add(box3);
        } catch (WeightException w) {
            System.out.println(w.getMessage() + ",最后一个箱子没办法装进去");
        }finally{
            System.out.println("继续正常启航");
        }
    }

}