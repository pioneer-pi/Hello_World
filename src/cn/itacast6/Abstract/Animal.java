package cn.itacast6.Abstract;

public abstract class Animal {
    //抽象方法
    public Animal(){}
    public Animal(String name){
        this.name = name;
    }
    String name = "哈士奇";
    final int AGE = 30;
    public abstract void eat();
    public abstract void sleep();

    public void call(){
        System.out.println("call!");
    }
}
