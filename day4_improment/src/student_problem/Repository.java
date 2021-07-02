package student_problem;

import java.util.ArrayList;
import java.util.List;

import student_problem.entity.Student;

public class Repository {
	private List<Student> students;
	public Repository() {
		students = new ArrayList<Student>();
	}
	public void save(Student stu) {
		students.add(stu);
	}
	public boolean delete(int studentID) {
		return false;
	}
	// add more functions here 
}
