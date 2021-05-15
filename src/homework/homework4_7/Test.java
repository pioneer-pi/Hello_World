package homework.homework4_7;

public class Test {
    public static void main(String[] args) {
        Button button1 = new Button();
        button1.setClickable(new Clickable(){
            @Override
            public void click(){
                System.out.println("ButtonA");
            }
        });
        Button button2 = new Button();
        button2.setClickable(new Clickable(){
            @Override
            public void click(){
                System.out.println("ButtonB");
            }
        });
        button1.getClickable().click();
        button2.getClickable().click();

        //in_class
        Button b1 = new Button();
        b1.setClickListener(new View.ClickListener(){
            @Override
            public void onClick() {
                System.out.println();
            }
        });
    }
}
