package homework.homework03.entity;

public class Course {
    private String name;
    private int course_number;
    private boolean is_Compulsory;

    public Course(){};
    public Course(String name,int course_number, boolean is_Compulsory){
        this.name = name;
        this.course_number = course_number;
        this.is_Compulsory = is_Compulsory;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getCourse_number(){
        return course_number;
    }
    public void setCourse_number(int course_number){
        this.course_number = course_number;
    }

        public boolean getIs_Compulsory(){
        return is_Compulsory;
    }
    public void setIs_Compulsory(boolean value){
        is_Compulsory = value;
    }
}
