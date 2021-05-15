package experiment.Experiment3.Number_six;

public class School implements ComputerAverage{
    public double average(double array[]){
        int length = array.length;
        double sum=0;
        for (int i = 0;i<length;i++){
            sum += array[i];
        }
        return sum/length;
    }
}
