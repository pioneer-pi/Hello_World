package experiment.Experiment3.Number_two;

public class Vehicle {
    private int wheels;
    private int weight;
    public Vehicle(int wheels,int weight){
        this.wheels = wheels;
        this.weight = weight;
    }
    public void show(){
        System.out.println("汽车有"+wheels + "个轮子，汽车的重量是"+weight+"kg");
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
