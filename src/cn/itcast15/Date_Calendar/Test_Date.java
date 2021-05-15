package cn.itcast15.Date_Calendar;

import java.util.Date;

public class Test_Date {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1);
        long time = d1.getTime();
        System.out.println(time);
        //Tue Mar 02 17:01:08 CST 2021 --> 1614675668745
        System.out.println("-----------");
        //创建一个指定的时间
        Date d2 = new Date(1614675668745l);
        System.out.println(d2);
    }
}
