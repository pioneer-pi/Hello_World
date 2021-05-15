package cn.itcast17.Collection_List;

import java.util.ArrayList;
import java.util.List;

/*使用集合步骤：
    1.创建集合对象
    2.创建元素对象
    3.将元素对象添加到集合对象
    4.遍历集合
 */
public class Test_arrayList {
    public static void main(String[] args) {
        List list = new ArrayList();
        Student s1 = new Student("乔峰",41);
        Student s2 = new Student("乔",28);
        Student s3 = new Student("乔",28);
        Student s4 = new Student("段誉",26);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        Object obj = list.get(2);
        System.out.println(list.get(2));
        System.out.println(list.size());

        System.out.println("----------------------");
        for (int i = 0;i < list.size();i++){
            System.out.println("索引为" + i +"的元素: " + list.get(i));
        }
    }
}
