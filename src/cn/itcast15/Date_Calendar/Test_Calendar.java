package cn.itcast15.Date_Calendar;

import org.w3c.dom.ls.LSOutput;

import java.util.Calendar;

public class Test_Calendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();//创建Calendar类型对象
        System.out.println(c);
        //获取年月日
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DATE);
        System.out.println("year: " + year);
        System.out.println("month: " + (month + 1));
        System.out.println("day: " + day);

        //设置时间
        c.set(Calendar.YEAR,2022);
        int year2 = c.get(Calendar.YEAR);
        c.set(2022,2,2);
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DATE));
    }
}
