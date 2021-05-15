package cn.itcast4.inheritance;

public class Apple extends Fruit{
    String color;
    public void eat(){
        System.out.println("eat" + color + size + "apple");
        super.color = color;
    }
}