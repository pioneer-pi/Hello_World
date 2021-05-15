package experiment.Experiment3.Number_four;

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        Teacher teacher1 = new Teacher();
        teacher1.setTeachable(new Teacher.Teachable(){
            @Override
            public void teach(){
                System.out.println("我是英语老师，我说"+str1);
            }
        });
        Teacher teacher2 = new Teacher();
        teacher2.setTeachable(new Teacher.Teachable(){
            @Override
            public void teach(){
                System.out.println("我是数学老师，我说"+ str2);
            }
        });
        TeachingRace(teacher1);
        TeachingRace(teacher2);
    }


    public static void TeachingRace(Teacher teacher){
        teacher.getTeachable().teach();
    }
    public static class Teacher {
        private Teachable teachable;

        public interface Teachable{
            public void teach();
        }
        public void setTeachable(Teachable teachable){
            this.teachable = teachable;
        }
        public Teachable getTeachable(){
            return teachable;
        }

    }
}
