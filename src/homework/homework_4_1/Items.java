package homework.homework_4_1;

public class Items {
    private User user;
    private Good[] goods;
    public Items(User user,Good[] goods){
        this.user = user;
        this.goods = goods;
    }
    public User getUser(){
        return user;
    }
    public void setUser(User user){
        this.user = user;
    }

    public Good[] getGoods(){
        return goods;
    }
    public void setGoods(Good[] goods){
        this.goods = goods;
    }
}
