package cn.itcast9.Interface;

public class Test {
    public static void main(String[] args) {
        USB usb = new Mouse();
        usb.open();
        usb.close();
    }
}
