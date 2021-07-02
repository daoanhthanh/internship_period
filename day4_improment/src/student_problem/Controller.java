package student_problem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import student_problem.entity.Gender;
import student_problem.entity.Student;

public class Controller {
	private Repository repo;
	private Student stu;

	public Controller() {
		repo = new Repository();
		stu = new Student();
	}

	// validate section
	private boolean validateStudent() {
		return validateName(stu.getName()) && validateGender(stu.getGender().name());

	}

	private boolean validateName(String studentName) {
		String regex = "^[A-Za-z]\\w{5,29}$";
		Pattern p = Pattern.compile(regex);
		if (studentName == null) {
			return false;
		}
		Matcher m = p.matcher(regex);
		return m.matches();

	}

	private boolean validateGender(String gender) {
		Enum sex = Enum.valueOf(Gender.class, gender);
		return (sex instanceof Gender);
	}
}
