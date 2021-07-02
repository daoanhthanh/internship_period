package studentDBProblem;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import studentDBProblem.entity.Gender;
import studentDBProblem.entity.Student;

public class Controller {
    private Service ser;
    private static int stuId;
    private Scanner sc;
    private String stuName;
    private LocalDate dob;
    private static Student student;

    public Controller() {
        ser = new Service();
        sc = new Scanner(System.in);
        student = new Student();
        stuId = 100;
    }

    // validation section
    private boolean validateStudent() {
        // TODO: add logic here
        return false;
    }

    private boolean validateName(String stuName) {
        // logic here
        return false;
    }

    private boolean validateDob(LocalDate dob) throws DateTimeParseException {
        // logic here
        return false;
    }

    private boolean validateOptionInput(int input) {
        boolean isValid = false;
        if (sc.hasNextInt()) {
            isValid = true;
        } else {
            System.out.println("Error! Invalid option. Only numeric input allowed.");
        }
        return isValid;
    }

    private void setStudentGender() throws Exception {
        System.out.println("*****\nChoose sex: \n1: MALE\n2: FEMALE\n3: I prefer not to say");
        String an = "0";
        int input = Integer.parseInt(an);
        while (!validateOptionInput(input)) {
            System.out.println("*****\nChoose sex: \n1: MALE\n2: FEMALE\n3: I prefer not to say");
            an = sc.nextLine();
        }

        switch (input) {
            case 1:
                student.setGender(Gender.MALE);
                break;
            case 2:
                student.setGender(Gender.FEMALE);
                break;
            case 3:
                student.setGender(Gender.OTHER);
                break;
            default:
                student.setGender(Gender.OTHER);

        }

    }

    public void askUserToSetStudent() throws Exception {
        boolean isContinue = false;

        while (!isContinue) {
            while (validateName(stuName) == true) {
                System.out.println("***Enter student's name: ");
                stuName = sc.nextLine();
            }
            while (!validateDob(dob)) {
                System.out.println("***Enter dob (YYYY-MM-DD): ");
                dob = LocalDate.parse(sc.nextLine());
            }
            setStudentGender();
            student.setName(stuName);
            student.setStudentCode(stuId);
            student.setDob(dob);
            ser.addStudent(student);
            ++stuId;
            System.out.println("-*_*_*_*_*_*_*-\nWant to add more? Y/N");
            String isY = sc.nextLine();
            if (isY.equalsIgnoreCase("y")) {
                isContinue = true;
            }
        }
    }

    public void showAllStudent() {

    }

}
