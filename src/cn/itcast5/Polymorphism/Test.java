package cn.itcast5.Polymorphism;

public class Test {
    public static void main(String[] args) {
        Animal an = new Dog();
        an.eat();
        if(an instanceof Dog){
            System.out.println("an 是 🐕");
            Dog dog = (Dog)an;
            dog.watch();
        }
    }
}