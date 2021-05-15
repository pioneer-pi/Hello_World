package experiment.Experiment3.Number_one;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("输入斑点狗信息(breed weight color spottedColor):");
        String breed = sc.next();
        int weight = sc.nextInt();
        String color = sc.next();
        String spottedColor = sc.next();
        SpottedDog spottedDog = new SpottedDog(breed,weight,color,spottedColor);
        Dog dog = new Dog(breed,weight,color);
//        System.out.println("输入非斑点狗信息(breed weight color): ");
        String breed2 = sc.next();
        int weight2 = sc.nextInt();
        String color2 = sc.next();
        UnspottedDog unspottedDog = new UnspottedDog(breed2,weight2,color2);
        dog.show();
                spottedDog.show();
                unspottedDog.show();
                }
public static class Dog {
    private String breed;
    private int weight;
    private String color;
    public Dog(){};
    public Dog(String breed,int weight,String color){
        this.breed = breed;
        this.weight = weight;
        this.color = color;
    }

    public void show(){
        System.out.println("这是一只"+ breed +"体重为"+weight+",颜色为"+color);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

public static class SpottedDog extends Dog{
    private String spotColor;
    public SpottedDog(String breed,int weight,String color,String spotColor){
        super(breed,weight,color);
        this.spotColor = spotColor;
    }
    public void show(){
        System.out.println("这是一只"+ getBreed() +",颜色为"+getColor()+",斑点颜色为"+spotColor);
    }
}
public static class UnspottedDog extends Dog{
    public UnspottedDog(String breed,int weight,String color){
        super(breed,weight,color);
    }
    public void show(){
        System.out.println("这是一只" + getBreed()+"犬");
    }
}
}

