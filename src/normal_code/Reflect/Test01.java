package normal_code.Reflect;
/*
反射作用：通过反射机制可以操作字节码文件，有点类似于黑客
java.lang.reflect.*;
相关类
java.lang.Class:代表字节码文件
java.lang.reflect.Method：代表字节码种方法字节码
java.lang.reflect.Constructor:代表字节码种构造方法
java.lang.reflect.Field:代表字节码中的属性字节码
 */

/*
获取类的字节码
 */
public class Test01 {
    /*
    Class.forName:
    1.静态方法
    2.参数为字符串
    3.需要一个完整类名
    4.必须带有包名
     */
    public static void main(String[] args) {
        try {
            Class c1 = Class.forName("java.lang.String");//c1代表String.class文件.
            Class c2 = Class.forName("java.util.Date");
            Class c3 = Class.forName("java.lang.Integer");
            Class c4 = Class.forName("java.lang.System");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //java中任何一个对象都有一个方法:getClass()
        String s = "abc";
        Class x = s.getClass();
    }
}
