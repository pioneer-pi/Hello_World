package normal_code.P6_Stream;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    private static final List<Apple> APPLES = create();
    private static List<Apple> create(){
        Apple a = new Apple(1,Apple.Color.RED,200);
        Apple a2 = new Apple(2,Apple.Color.GREEN,250);
        Apple a3 = new Apple(3,Apple.Color.RED,260);
        Apple a4 = new Apple(4,Apple.Color.GREEN,230);
        List<Apple> apples = new ArrayList<>();
        apples.add(a);
        apples.add(a2);
        apples.add(a3);
        apples.add(a4);

        Optional.ofNullable(apples)
                .ifPresent(app -> app.forEach(b -> b.getColor()));
        return apples;
    }

    public static void main(String[] args) {
        //打印每个苹果的重量
//        APPLES.forEach(a-> System.out.println(a.getWeight()));
        create();
    }
    public static void getStreamMap(Apple.Color c,int weight){
        Stream<Apple> appleStream = APPLES.stream();
        Stream<Apple> colorStream = appleStream.filter(a -> c==a.getColor());
        List<Apple> apples = colorStream.collect(Collectors.toList());
        //基于Stream 的方法链
        List<Apple> apples2 = APPLES.stream().filter(a -> c == a.getColor()).collect(Collectors.toList());
        //颜色和重量符合
        List<Apple> apples3 = APPLES.stream().filter(a -> c == a.getColor())
                .filter(a -> weight == a.getWeight())
                .collect(Collectors.toList());
    }
    //映射Stream中元素,基于条件将元素映射为新元素类型
    public static void normal_method(Apple.Color color){
        APPLES.stream()
                .map(Apple::getWeight)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("---------------------");
        //先挑选出符合颜色的苹果，再按照重量重新收集
        List<Integer> list= APPLES.stream()
                .filter(a -> a.getColor()==color)
                .map(a -> a.getWeight())//.map(Apple::getWeight)
                .collect(Collectors.toList());
        //比较器
        //以苹果的重量顺序排序
        APPLES.stream()
                .sorted(Comparator.comparing(Apple::getWeight))
                .collect(Collectors.toList())
                .forEach(a -> System.out.println(a.getId() + "/" + a.getColor() + "/" + a.getWeight()));
        //以苹果的ID逆排序
        APPLES.stream()
                .sorted(Comparator.comparing(Apple::getId).reversed())
                .collect(Collectors.toList())
                .forEach(a -> System.out.println(a.getId() + "/" + a.getColor() + "/" + a.getWeight()));

        //groupingBy() 基于给定数据,以Map分组集合
            //将不同颜色的苹果分组
        Map<Apple.Color,List<Apple>> map = APPLES
                .stream()
                .collect(Collectors.groupingBy(Apple::getColor));
            //以ID为键，以元素对象为值
        Map<Integer,Apple>map2 = APPLES
                .stream()
                .collect(Collectors.toMap(Apple::getId,Apple -> Apple));

        map2.forEach((k,v) -> System.out.println(k + "/" + v.getWeight()));

        APPLES.removeIf(apple -> apple.getColor() == color);
    }
}
