package experiment.Experiment3.Number_five;

public class Mouse extends Animal{
    private String name;
    public Mouse(String name){
        this.name = name;
    }
    public void speak(){
        System.out.println(name + " 的叫声为吱吱");
    }
}
