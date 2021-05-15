package experiment.Experiment3.Number_three;

public abstract class Employer {
    private String name;
    private String department;
    private int salary;
    public Employer(String name,String department,int salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public abstract void showBonus();
    public void showSalary(){
        System.out.println("我的工资为"+salary+"元");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
