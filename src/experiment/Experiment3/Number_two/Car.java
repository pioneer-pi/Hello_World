package experiment.Experiment3.Number_two;


public class Car extends Vehicle{
    private int number;
    public Car(int wheels,int weight,int number){
        super(wheels,weight);
        this.number = number;
    }

    public void show(){
        System.out.println("汽车有"+getWheels() + "个轮子，汽车的重量是"+getWeight()+"kg");
        System.out.println("汽车可以搭载"+number+"个乘客");
    }

}
