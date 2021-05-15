package homework.homework4_9;

public class Test {
    public static void main(String[] args) {
        I i = new S();
        F f = (F)i;
        S s = (S)f;

        System.out.println(f.getClass());
    }
}
