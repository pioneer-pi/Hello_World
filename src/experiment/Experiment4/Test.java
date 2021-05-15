package experiment.Experiment4;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        StudentServiceImpl studentService = new StudentServiceImpl();
        Student stu1 = new Student(2019210179,Student.Sex.MALE,"pioneer",2019);
        System.out.println("add method:");
        add(studentService,stu1);
        System.out.println("ListByYear method: ");
        listByYear(studentService,2012);
        System.out.println("ListNames method through year selected: ");
        listNames(studentService,2012,Student.Sex.MALE);
        System.out.println("mapBySex method: ");
        mapBySex(studentService);
        System.out.println("remove method: ");
        remove(studentService,2019210179);

    }
    public static void add(StudentServiceImpl stu,Student student){
        stu.addStudent(student);
    }
    public static void listByYear(StudentServiceImpl stu,int year){
        List<Student> list= stu.listStudentsByYear(year);
        list.forEach(
                student -> System.out.println(student.getName() + ": " +student.getYear())
        );
    }
    public static void listNames(StudentServiceImpl stu, int year, Student.Sex sex){
        List<String> list = stu.listStudentsNames(year,sex);
        list.forEach(
                System.out::println
        );
    }
    public static void mapBySex(StudentServiceImpl stu){
        Map<Student.Sex, List<Student>> map= stu.mapStudentsBySex();
        map.forEach((k,v) -> System.out.println(k + ": " + v.stream().map(Student::getName).collect(Collectors.toList())));
    }
    public static void remove(StudentServiceImpl stu,int id){
        boolean b = stu.removeStudent(id);
        if (b){
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
}
