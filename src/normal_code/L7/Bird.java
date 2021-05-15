package normal_code.L7;

public class Bird extends Animal implements Flyable {
    private String color;
    public Bird(String name,String color){
        super(name);
        this.color = color;
    };
    @Override
    public void fly(){
        System.out.println(getName() + " is flying");
    }

    @Override
    public void move(){
        System.out.println(getName() + " moves slow");
    }

}
