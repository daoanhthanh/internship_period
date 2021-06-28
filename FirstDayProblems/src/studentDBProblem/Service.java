package studentDBProblem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import studentDBProblem.entity.Gender;
import studentDBProblem.entity.Student;

public class Service {
    private List<Student> students;

    public Service() {
        students = new ArrayList<Student>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * @properties
     * 
     *             <pre>
     * .
     *             </pre>
     * 
     *             <pre>
     *             filter(sex)
     *             </pre>
     * 
     * 
     *             <pre>
     *             sort(age) && sort(studentCode)
     *             </pre>
     */
    public void getAll() {
        students.stream().filter(s -> s.getGender().equals(Gender.MALE))
                .sorted(sortByAge().thenComparing(sortByStudentCode())).forEach(System.out::println);
        System.out.println("*******************");
        students.stream().filter(s -> s.getGender().equals(Gender.FEMALE))
                .sorted(sortByAge().thenComparing(sortByStudentCode())).forEach(System.out::println);
        System.out.println("*******************");
        students.stream().filter(s -> s.getGender().equals(Gender.OTHER))
                .sorted(sortByAge().thenComparing(sortByStudentCode())).forEach(System.out::println);
    }

    private Comparator<Student> sortByAge() {
        // descending order!!!!!! NOTE THAT
        return ((Student s1, Student s2) -> Integer.compare(s2.getAge(), s1.getAge()));
    }

    private Comparator<Student> sortByStudentCode() {
        // ascending order
        return ((Student s1, Student s2) -> s1.getStudentCode().compareTo(s2.getStudentCode()));
    }

}
