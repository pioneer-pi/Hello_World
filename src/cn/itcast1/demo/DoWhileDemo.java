package cn.itcast1.demo;

public class DoWhileDemo {
    public static void main(String[] args) {
        int count = 1;
        boolean isOk = false;
        do{
            System.out.println("这是第" + count + "次练习");
            if(count >= 3){
                isOk = true;
            }
            count++;
        }while( !isOk );
    }
}
