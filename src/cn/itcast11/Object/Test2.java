package cn.itcast11.Object;


import org.w3c.dom.ls.LSOutput;

//测试Student
public class Test2 {
    public static void main(String[] args) {
        Student stu = new Student(1,"欧阳修",66);
        System.out.println(stu);

        //输出语句直接打印对象，默认调用了该对象的toString方法
        Student stu2 = new Student(1,"欧阳修",66);

        System.out.println(stu.equals(stu2));
    }
}
