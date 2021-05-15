package experiment.Experiment3.Number_three;

public class BasicEmployee extends Employer{
    public BasicEmployee(String name, String department, int salary) {
        super(name, department, salary);
    }

    @Override
    public void showBonus(){
        System.out.println("我是普通员工 我没有奖金");
    }

}
