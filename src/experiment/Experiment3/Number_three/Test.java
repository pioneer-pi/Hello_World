package experiment.Experiment3.Number_three;

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入普通员工信息(name,department,salary):");
        String name = sc.next();
        String department = sc.next();
        int salary = sc.nextInt();
        BasicEmployee be = new BasicEmployee(name,department,salary);
        System.out.println("My name is " + be.getName());
        System.out.println("My department is "+ be.getDepartment());
        be.showSalary();
        be.showBonus();
        System.out.println("请输入优秀员工信息(name,department,salary,bonus):");
        name = sc.next();
        department = sc.next();
        salary = sc.nextInt();
        int bonus = sc.nextInt();
        GoodEmployee ge = new GoodEmployee(name,department,salary,bonus);
        System.out.println("My name is " + ge.getName());
        System.out.println("My department is "+ ge.getDepartment());
        ge.showSalary();
        ge.showBonus();

    }
}
