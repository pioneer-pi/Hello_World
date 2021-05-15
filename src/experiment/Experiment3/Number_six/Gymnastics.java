package experiment.Experiment3.Number_six;

public class Gymnastics implements ComputerAverage{
    public double average(double array[]){
        double sum=0;
        double max=array[0];
        double min=array[0];
        double average;
        int length = array.length;
        for(double i:array){
            sum += i;
        }
        for (int i=1;i<length;i++){
            if(array[i]>max)
                max =array[i];
            if(array[i]<min)
                min = array[i];
        }
        average = (sum-max-min)/(length-2);
        return average;
    }
}
