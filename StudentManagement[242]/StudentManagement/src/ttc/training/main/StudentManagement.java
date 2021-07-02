package ttc.training.main;

import ttc.trainiing.service.StudentService;

public class StudentManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentService studentService = new StudentService();
		studentService.createStudent();
		studentService.sortByStream();
	}

}
