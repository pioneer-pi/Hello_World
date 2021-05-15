package homework.homework_4_1;

public class Test {
    public static void main(String args[]){
        User me = new User("pioneer",99);
        Good noodles = new Good("方便面",5.5f);
        Good sausage = new Good("火腿肠",2.2f);
        Good[] goods = new Good[6];
        for(int i = 0;i < 2;i++){
            goods[i] = noodles;
        }
        for (int i=2;i < 6;i++){
            goods[i] = sausage;
        }

        Items items = new Items(me,goods);
        float balance = count(items.getUser(),items.getGoods());
        System.out.println("用户" + items.getUser().getName()+ "的余额为: " + balance);
    }

    public static float count(User u,Good[] goods){
        float balance = u.getBalance();
        for (Good goods1: goods) {
            balance -= goods1.getPrice();
        }
        u.setBalance(balance);
        return balance;
    }

}
