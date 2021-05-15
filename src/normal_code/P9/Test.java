package normal_code.P9;

import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        Optional<Computer> op = Optional.ofNullable(null);
        Optional<Computer> op2 = Optional.ofNullable(new Computer());
    }
    public static void getIfPresent(USB usb){
        //////1 2 等价
        //1
        Optional<USB> usbOP = Optional.ofNullable(usb);
        usbOP.ifPresent(u -> System.out.println(u.getVersion()));
        //2
        Optional.ofNullable(usb)
                .ifPresent(u -> System.out.println(u.getVersion()));

    }

    //ifPresentOrElse函数 ：如果不为空执行第一个语句，如果为空 执行第二个语句
    public static void ifPresentOrElse(USB usb) {
        Optional.ofNullable(usb)
                .ifPresentOrElse(u -> System.out.println(u.getVersion()),() -> System.out.println("usb 为空"));
    }
    //过滤
    public static void filter(USB usb){
        Optional.ofNullable(usb)
                .filter(u -> "3.0".equals(u.getVersion()))
                .ifPresent(u -> System.out.println(u.getVersion()));
    }
    //映射
    public static void map(USB usb){
        Optional.ofNullable(usb)
                .map(USB::getVersion)
                .ifPresent(System.out::println);
    }
    //or()函数 容器为空，执行函数，且必须返回一个，相同类型的容器，可以为空容器
    //如果版本为UNKNOWN，创建USB1.1
    private static void or(USB usb){
        Optional.ofNullable(usb)
                .filter(u -> !"UNKNOWN".equals(u.getVersion()))
                .or(() -> {
                    return Optional.of(new USB());
                })
                .ifPresent(u -> System.out.println(u.getVersion()));
    }
    //orElse and orElseGet
    private static void orElse(USB usb){
        String v2 = Optional.ofNullable(usb)
                .orElse(new USB())
                .getVersion();
    }

        USB usb = null;
    private static void orElseGet(USB usb){
        String v1 = Optional.ofNullable(usb)
                .orElseGet(() -> {USB u = new USB();
                return u;
                })
                .getVersion();
    }

    //get() 返回容器中对象，如股票为空，抛出异常

    //CC:容器对象无法被序列化，因此Optional不应该作为属性
}
