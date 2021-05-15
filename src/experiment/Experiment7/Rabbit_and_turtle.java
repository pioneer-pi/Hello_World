package experiment.Experiment7;

public class Rabbit_and_turtle {
    public static int length1 = 1000;
    public static int length2 = 1000;
    public static void main(String[] args) {
        Thread turtle = new Thread(new Runnable() {
            @Override
            public void run() {
                while(length1 > 0){
                    length1 -=1;
                    if (length1 >0 ){
                        System.out.println("乌龟距离终点"+length1+"米");
                    }
                }
                System.out.println("乌龟到达了终点");
            }
        });
        Thread rabbit = new Thread(new Runnable() {
            int count = 0;
            @Override
            public void run() {
                while(length2 > 0){
                    length2 -=10;
                    if (length2 >0 ){
                        System.out.println("兔子距离终点"+length2+"米");
                    }
                    if (length1 > length2){
                        try {
                            Thread.sleep(5);
                            System.out.println("我跑得快，睡一觉");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                System.out.println("兔子到达了终点");
            }
        });
        turtle.start();
        rabbit.start();
    }
}
