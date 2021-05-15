package normal_code.P11Thread;
/*sleep
1.静态方法
2.参数是毫秒
3.让当前线程进入休眠，放弃占有时间片
*/
public class Thread5_sleep {
    public static void main(String[] args) {
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("hello world!");
    }
}
