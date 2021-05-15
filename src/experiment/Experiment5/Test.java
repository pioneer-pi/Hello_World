package experiment.Experiment5;

import java.awt.image.ImageProducer;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args)  {
        List<Student> STUDENTS= DatabaseUtils.getStudents();
         System.out.println(getCourseName(DatabaseUtils.getStudents(),8888));
         printCollegeName(DatabaseUtils.getStudents(), 201001, 1002);
         printCollegeName(DatabaseUtils.getStudents(), 201001, 1001);
//        System.out.println(getCourseName(STUDENTS,201103));
//        printCollegeName(STUDENTS,201104,1002);
    }

    /**
     * 基于给定学生集合，学生编号，实现获取学生的导师的所在学院名称。
     * 任何一项不存在或失败，打印显式 未知学院
     * @param student
     * @param sNumber
     * @return
     */
    private static String getCourseName(List<Student> student, int sNumber) {
        return student.stream()
                .filter(s -> s.getNumber() == sNumber)
                .findFirst()
                .map(Student::getTeacher)
                .map(Teacher::getCollege)
                .map(College::getName)
                .orElse("未知学院");
    }

    /**
     * 实现在给定学生集合中查询指定编号学生，如果学生导师编号为指定编号，打印显式导师所在学院名称。
     * 任何一项不存在或失败，打印显式 未知学院
     * @param students
     * @param sNumber
     * @param tNumber
     */
    private static void printCollegeName(List<Student> students, int sNumber, int tNumber) {
        students.stream()
                .filter(s -> s.getNumber() == sNumber)
                .findFirst()
                .map(Student::getTeacher)
                .filter(t -> t.getNumber() == tNumber)
                .map(Teacher::getCollege)
                .map(College::getName)
                .ifPresentOrElse(System.out::println,()-> System.out.println("未知学院"));

    }


}
