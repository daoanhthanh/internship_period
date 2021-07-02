package ttc.trainiing.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import ttc.training.models.Student;
import ttc.training.models.StudentAfterList;
import ttc.training.utils.Validator;

public class StudentService {

	private static List<Student> students;

	public StudentService() {
		students = new ArrayList<>();
	}

	public void createStudent() {

		Scanner sc = new Scanner(System.in);
		String id, name, gender, loop;
		boolean st = false;

		do {
			Student student = new Student();
			System.out.println("---- Enter Student information----");

			do {
				System.out.print("Enter student id(SV001): ");
				id = sc.nextLine();
				try {
					student.setId(id);
					st = !(Validator.isStudentId(id));

				} catch (Exception e) {
					System.out.println("Invalid value!");
					st = true;
				}
			} while (st);

			System.out.print("Enter student name: ");
			name = sc.nextLine();
			student.setName(name);

			do {
				try {
					System.out.print("Enter birth of date(yyyy-mm-dd): ");
					LocalDate date = LocalDate.parse(sc.nextLine());
					student.setBirthOfDate(date);
					break;
				} catch (Exception e) {
					System.out.println("Invalid value!");
					st = true;
				}
			} while (st);

			do {
				System.out.print("Enter student gender(MALE/FEMALE/GAY): ");
				gender = sc.nextLine();
				try {
					student.setGender(gender);
					st = !(Validator.isGender(gender));
				} catch (Exception e) {
					System.out.println("Invalid value!");
					st = true;
				}
			} while (st);

			students.add(student);

			System.out.println("Do you want to input student for this course (Y/N)?: ");
			loop = sc.nextLine();

		} while (loop.equalsIgnoreCase("y"));

	}

	public void sortByStream() {

		List<StudentAfterList> studentAfterList = students.stream().sorted(Comparator.comparing(Student::getGender))
				.sorted(Comparator.comparing(Student::getGender)
						.thenComparing((Student s) -> (LocalDate.now().getYear() - s.getBirthOfDate().getYear()))
						.reversed().thenComparing(s -> s.getId()))
				.map(x -> new StudentAfterList(x.getId(), x.getName(),
						LocalDate.now().getYear() - x.getBirthOfDate().getYear()))
				.collect(Collectors.toList());

		studentAfterList.forEach(System.out::println);

	}
}
