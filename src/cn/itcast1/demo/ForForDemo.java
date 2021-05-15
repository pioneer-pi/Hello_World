package cn.itcast1.demo;

public class ForForDemo {
    public static void main(String[] args) {
        for(int class_ = 1; class_ <= 3;class_++){
            for (int student = 1;student <= 5;student++){
                System.out.println("正在获取第" + class_ +"个班级的第" + student + "个学生");
            }
            System.out.println();
        }
    }
}
