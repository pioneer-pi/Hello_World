package cn.itcast3.Class;

import cn.itcast4.inheritance.Father;
public class Son extends Father {
    public static void main(String[] args) {
        Father f = new Father();
//        f.show1();
//        f.show2();
//        f.show3();
        f.show4();

        Son son = new Son();
//        son.show1();
//        son.show2();
        son.show3();
        son.show4();
    }
}