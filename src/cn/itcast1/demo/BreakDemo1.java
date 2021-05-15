package cn.itcast1.demo;

public class BreakDemo1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            System.out.println("我是编号为:" + i + "的学生");
            if (i == 3) {
                break;
            }
        }
    }
}
