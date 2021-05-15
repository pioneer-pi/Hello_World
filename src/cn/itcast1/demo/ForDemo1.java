package cn.itcast1.demo;

public class ForDemo1 {
    //水仙花数
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100;i < 1000;i++){
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            if(ge*ge*ge + shi*shi*shi + bai*bai*bai == i){
                System.out.println(i + "是水仙花数");
                count ++;
            }
        }
        System.out.println("所有水仙花个数: " + count);

    }
}