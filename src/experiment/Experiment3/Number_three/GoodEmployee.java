package experiment.Experiment3.Number_three;

public class GoodEmployee extends Employer{
    private int bonus;
    public GoodEmployee(String name,String department,int salary,int bonus){
        super(name,department,salary);
        this.bonus = bonus;
    }
    @Override
    public void showBonus(){
        System.out.println("我是优秀员工，我的奖金是" + bonus+"元");
    }
}
