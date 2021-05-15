package cn.itcast1.demo;

public class BreakDemo2 {
    public static void main(String[] args) {
        label_class:for(int i = 1;i <=3;i++){
            for(int student = 1;student < 11;student++){
                if(i == 2 && student == 5)
                    break label_class;
            }
        }
    }
}
