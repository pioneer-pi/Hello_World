package cn.itacast6.Abstract;

public class Coder extends Employee {
    public Coder() {
        super();
    }

    public Coder(String name, double salary, String id) {
        super(name, salary, id);
    }

    @Override
    public void work(){
        System.out.println("Coder is programming");
    }
}
