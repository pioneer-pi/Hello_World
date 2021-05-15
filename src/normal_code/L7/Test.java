package normal_code.L7;

public class Test {
    public static void main(String[] args) {
        Movable animal = new Animal("Lion");
        Flyable bird = new Bird("Raven","black");

        System.out.println(bird.getClass().getName());
        System.out.println(bird.getClass().getSimpleName());
    }
}
