package cn.itcast5.Polymorphism;

public class Dog extends Animal {
    String name = "dog";
    @Override
    public void eat(){
        System.out.println(getName() + "吃骨头");
    }
    public void watch(){
        System.out.println("watch");
    }
}
