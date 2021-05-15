package homework.homework4_7;

public class View {
    private Clickable clickable;
    //in_class
    private ClickListener clickListener;

    //in_class
    public interface ClickListener{
        void onClick();
    }

    public ClickListener getClickListener() {
        return clickListener;
    }

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void setClickable(Clickable clickable){
        this.clickable = clickable;
    }
    public Clickable getClickable(){
        return clickable;
    }

}
