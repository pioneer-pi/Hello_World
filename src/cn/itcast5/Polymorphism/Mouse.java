package cn.itcast5.Polymorphism;

public class Mouse extends Animal {
    @Override
    public void eat(){
        System.out.println(getName() + "吃奶酪");
    }
}
