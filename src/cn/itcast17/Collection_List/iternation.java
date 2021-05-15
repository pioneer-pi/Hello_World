package cn.itcast17.Collection_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//普通迭代器在遍历集合同时不能添加和删除元素
//列表迭代器可以 ，但添加删除时候 必须使用列表迭代器中的方法
public class iternation {
    public static void main(String[] args) {
        //通过迭代器遍历List集合
        /*使用迭代器步骤
        1.根据集合对象获取其对象的迭代器对象
        2.判断迭代器中是否有元素
         */
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");

        //1.
//        Iterator it = list.iterator();
//        while(it.hasNext()){
//            String s  = (String)it.next();
//            System.out.println(s);
//        }
//        System.out.println("--------------------------");

//        Iterator it2 = list.iterator();
//        while(it2.hasNext()){
//            String s = (String)it2.next();
//            if("b".equals(s)){ //这样写可以规避空指针异常
//                list.add("java");//会报错
//            }
//            System.out.println(s);
//        }

        //列表迭代器
        ListIterator it3 = list.listIterator();
        while(it3.hasNext()){
            String s = (String)it3.next();
            if ("b".equals(s)){
                //list.add("java");//这样写不可以
                it3.add("java");
            }
            System.out.println(s);
        }
        System.out.println(list);
    }
}
