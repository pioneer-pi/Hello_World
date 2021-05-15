package homework.homework03.test;

import homework.homework03.entity.Course;

public class CourseTest {
    private static void testNewStudent(){
        Course course = new Course("Java程序设计",2018001,true);
        System.out.println(course.getName());
        System.out.println(course.getCourse_number());
        System.out.println(course.getIs_Compulsory());

        course.setName("Web开发技术");
        course.setIs_Compulsory(false);

        System.out.println(course.getName());
        System.out.println(course.getCourse_number());
        System.out.println(course.getIs_Compulsory());
    }
    public static void main(String args[]){
        testNewStudent();
    }
}
