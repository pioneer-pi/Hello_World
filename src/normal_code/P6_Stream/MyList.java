package normal_code.P6_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

import static normal_code.P6_Stream.MyFunction.f;

public class MyList {
    private List<Integer> list;
    public MyList(List<Integer> list){
        this.list = list;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(5);
        nums.add(7);
        MyList list= new MyList(nums);
        list.forEach(f);
    }
    public void forEach(MyFunction f){
        for (Integer i:list){
            int result = f.getValue(i);
            System.out.println(result);
        }
    }
}
