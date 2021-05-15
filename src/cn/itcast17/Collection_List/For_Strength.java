package cn.itcast17.Collection_List;

import java.util.ArrayList;
import java.util.List;

public class For_Strength {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(10);
        list.add(30);
        list.add(40);

        for (Object obj : list) {
            //obj 是集合中的元素，本身应该是Integer类型的元素
            Integer ii = (Integer) obj;
            System.out.println(ii);
        }
        System.out.println("------------------");
//        注意:增强for底层是迭代器
        //快捷键 iter ----> Enter
        for (Object o : list) {
            Integer ii = (Integer) o;
            System.out.println(ii);
        }
    }
}
