package cn.itcast4.inheritance;

public class NineYin extends Martial {
    public void internalStrength(){
        super.internalStrength();
        System.out.println("以柔克刚");
    }
    public void stroke(){
        super.stroke();
        System.out.println("九阴白骨爪");
    }
}
