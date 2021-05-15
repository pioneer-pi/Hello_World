package cn.itcast3.Class;

public class Student {
    public Student(){} //无参构造


    public Student(String name,int age){//带参构造
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
