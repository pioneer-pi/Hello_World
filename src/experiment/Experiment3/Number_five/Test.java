package experiment.Experiment3.Number_five;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.next();
        String name2 = sc.next();
        Mouse mouse = new Mouse(name2);
        Cat cat = new Cat(name1);
        cat.speak();
        mouse.speak();
    }
}
