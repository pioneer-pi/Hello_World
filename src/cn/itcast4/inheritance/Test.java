package cn.itcast4.inheritance;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setName("gou");
        d.setAge(2);
        d.setSex("male");
        d.watch();
        d.eat();
        System.out.println("----------");
        Pig p = new Pig();
        p.setName("zhu");
        p.setAge(3);
        p.snore();
        p.eat();
    }
}
//JAVA中，子类只能继承父类的非私有成员.
