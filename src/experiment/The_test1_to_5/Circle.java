package experiment.The_test1_to_5;

public class Circle implements Shape {

    private int r;

    public Circle(int r) {

        this.r = r;

    }

    @Override

    public int getPerimeter() {

        return 2 * 3 * r;

    }

}
