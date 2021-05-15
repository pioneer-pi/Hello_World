package experiment.Experiment6;

import javafx.scene.chart.ScatterChart;

public class Chip {
    private final int TOTAL_WEIGHT = 5000;
    private  int WEIGHT = 0;
    public int getWEIGHT(){
        return WEIGHT;
    }
    public void add(Box box) throws WeightException{
            if (WEIGHT + box.getWeight() > TOTAL_WEIGHT) {
                throw new WeightException("超重了");
            }
            else{
                WEIGHT += box.getWeight();
            }

    }
}
