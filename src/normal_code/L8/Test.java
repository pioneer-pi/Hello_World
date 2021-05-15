package normal_code.L8;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Pioneer");
        s1.setLearnable(new Learnable(){
            @Override
            public void read(){
                System.out.println("我要按照自己的方式阅读");
            }
        });
        System.out.println();

        System.out.println(s1.getLearnable());
        s1.getLearnable().read();

        Student s2 = new Student("Sun");
        s2.setLearnable(new Learnable(){
            @Override
            public void read(){
                System.out.println("我要读" + 5 +"本书");
            }
        });
        System.out.println(s2.getLearnable());
        s2.getLearnable().read();
    }
}
