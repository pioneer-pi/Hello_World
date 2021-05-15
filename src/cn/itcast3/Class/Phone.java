package cn.itcast3.Class;
//定义一个手机类
public class Phone {
    //成员变量：定义在类中，方法外的变量；
    String brand;
    String model;
    String name;

    //成员方法：
    public void call(String name){
        System.out.println("给" + name + "打电话");
    }
    public void sendMessage(String name){
        System.out.println("给" + name + "发短信");
    }
    public void playGame(String name){
        System.out.println("玩游戏");
    }

}