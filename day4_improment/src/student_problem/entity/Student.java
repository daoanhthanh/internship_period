package student_problem.entity;

import java.time.LocalDate;
import java.time.Period;

public class Student {
    private int studentCode;
    private String name;
    private LocalDate dob;
    private Gender gender;

    public Student() {
    }

    public Student(int studentCode, String name, LocalDate dob, Gender gender) {
        this.studentCode = studentCode;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
    }

    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Gender getGender() {
        return gender;
    }
    

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        Period diff = Period.between(getDob(), LocalDate.now());
        return diff.getYears();
    }

    @Override
    public String toString() {
        return "Student [dob=" + dob + ", age=" + getAge() + ", studentCode=" + studentCode + ", gender=" + gender
                + ", name=" + name + "]";
    }

}
