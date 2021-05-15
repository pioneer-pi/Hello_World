package cn.itcast9.Interface;

public class Mouse implements USB{
    public void open(){
        System.out.println("连接鼠标");
    };
    public void close(){
        System.out.println("断开连接");
    };
}
