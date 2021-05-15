package normal_code.P11Thread;

public class Thread4 {
    public static void main(String[] args) {
        MyThread2 t = new MyThread2();
//        t.setName("tttt");
        t.start();
        String tName = t.getName();
        System.out.println(tName);
    }
}
class MyThread2 extends Thread{
    public void run(){
        for (int i = 0;i<100;i++){
            System.out.println("分支线程->>" + i);
        }
    }
}
