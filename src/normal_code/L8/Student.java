package normal_code.L8;

public class Student {
    private String name;
    private Learnable learnable;
    public Student(String name){
        this.name = name;
    }

    public void setLearnable(Learnable learnable){
        this.learnable = learnable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Learnable getLearnable() {
        return learnable;
    }
}
