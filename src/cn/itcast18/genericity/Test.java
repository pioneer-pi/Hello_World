package cn.itcast18.genericity;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //演示泛型

        //不适用泛型的集合
        List list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
      //  list.add(10);//会报类型转换异常
        for (Object o : list) {
            String s = (String)o;
            System.out.println(s);
        }
        System.out.println("-------------------");
        List <String> list2 = new ArrayList<String>();
        list2.add("abc");
        list2.add("sad");
        list2.add("10");

        for (String s : list2){
            System.out.println(s);
        }
    }
}
