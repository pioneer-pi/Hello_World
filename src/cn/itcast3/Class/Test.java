package cn.itcast3.Class;

public class Test {
    public static void main(String[] args) {
        Student2 stu1 = new Student2();
        stu1.setName("张三");
        stu1.setAge(23);
        System.out.println(stu1.getName());
        System.out.println(stu1.getAge());
        System.out.println("------------");
        Student2 stu2 = new Student2("李四",25);
        System.out.println(stu2.getAge());
        System.out.println(stu2.getName());
    }
}