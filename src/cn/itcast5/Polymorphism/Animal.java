package cn.itcast5.Polymorphism;

public class Animal {
    String name = "animal";

    public Animal(){
    }
    public Animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("eat!");
    }
}
