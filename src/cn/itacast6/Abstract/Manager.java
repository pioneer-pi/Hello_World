package cn.itacast6.Abstract;

public class Manager extends Employee {
    private int bonus;

    public Manager() {
    }

    public Manager(String name, double salary, String id, int bonus) {
        super(name, salary, id);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("Manager is relax");
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
