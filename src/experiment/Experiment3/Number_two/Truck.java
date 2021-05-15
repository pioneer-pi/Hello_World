package experiment.Experiment3.Number_two;

public class Truck extends Vehicle{
    private int chengke;
    private int zaihuoliang;
    public Truck(int wheels,int weight,int chengke,int zaihuoliang){
        super(wheels,weight);
        this.chengke = chengke;
        this.zaihuoliang = zaihuoliang;
    }
    public void show(){
        System.out.println("汽车有"+getWheels() + "个轮子，汽车的重量是"+getWeight()+"kg");
        System.out.println("汽车可以搭载"+chengke+"个乘客");
        System.out.println("汽车的载货量是"+zaihuoliang);
    }
}
