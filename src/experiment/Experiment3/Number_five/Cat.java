package experiment.Experiment3.Number_five;

public class Cat extends Animal{
    private String name;
    public Cat(String name){
        this.name = name;
    }
    public void speak(){
        System.out.println(name + "的叫声为喵喵");

    }
}
