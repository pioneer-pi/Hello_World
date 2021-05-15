package cn.itcast7.Final;

public class Test {
    public static void main(String[] args) {
        Developer d1 = new Developer();
        d1.name = "hei";
        d1.work = "coder";
        d1.selfIntroduction();

        Developer d2 = new Developer();
        d2.work = "encourage";
        d2.name = "媛媛";
        d2.selfIntroduction();
        System.out.println("------------");
//        Developer.departmentName = "";
    }
}
