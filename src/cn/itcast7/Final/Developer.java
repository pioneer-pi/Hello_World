package cn.itcast7.Final;

public class Developer {
    String name;
    String work;
    public final static String departmentName = "研发部";

    public void selfIntroduction(){
        System.out.println("我是" + departmentName + "de" + name + work);
    }
}
