package cn.itacast6.Abstract;


public class Test {
    public static void main(String[] args) {
        Employee coder = new Coder();
        coder.work();
        Employee manager = new Manager();
        manager.work();
        System.out.println("-------------");
        //快速实例化
        Employee c = new Coder("张三",30000,"aaa");
        Manager m = new Manager("lisi",40000,"111",100000);
        System.out.println("name: " + m.getName());
        System.out.println("salary: " + m.getSalary());
        System.out.println("id: " + m.getId());
        System.out.println("bonus: " + m.getBonus());
    }
}
