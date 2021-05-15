package experiment.Experiment4;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentServiceImpl implements StudentService{
    private static final List<Student> STUDENTS = DatabaseUtils.getStudents();
    @Override
    public List<Student> addStudent(Student student){
        DatabaseUtils.getStudents().add(student);
        return DatabaseUtils.getStudents();
    }

    @Override
    public List<Student> listStudentsByYear(int year){
        Stream<Student> studentStream = STUDENTS.stream();
        Stream<Student> yearStream = studentStream.filter(student -> year == student.getYear());
        List<Student> students = yearStream.collect(Collectors.toList());

        List<Student> students1 = STUDENTS.stream().filter(student -> year ==student.getYear()).collect(Collectors.toList());
        return students;
    }
    @Override
    public List<String> listStudentsNames(int year,Student.Sex sex){
         List<String> nameList= STUDENTS.stream()
                    .filter(student -> student.getYear()==year)
                    .map(Student::getName)//.map(student -> student.getName())
                    .collect(Collectors.toList());
        return nameList;
    }

    @Override
    public Map<Student.Sex, List<Student>> mapStudentsBySex(){
        Map<Student.Sex,List<Student>> map = STUDENTS.stream()
                .collect(Collectors.groupingBy(Student::getSex));

        return map;
    }

    public boolean removeStudent(int id){
        return STUDENTS.removeIf(student -> student.getId()==id);
    }

}
