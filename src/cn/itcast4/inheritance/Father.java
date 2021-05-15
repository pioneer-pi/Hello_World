package cn.itcast4.inheritance;

public class Father {
    private void show1(){
        System.out.println("show1 private");
    }
    void show2(){
        System.out.println("show2 默认");
    }
    protected void show3(){
        System.out.println("show3 protected");
    }
    public void show4(){
        System.out.println("show4 public");
    }

    public static void main(String[] args) {
        Father f = new Father();
        f.show1();
        f.show2();
        f.show3();
        f.show4();
    }
}
