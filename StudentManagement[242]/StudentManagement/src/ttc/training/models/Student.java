package ttc.training.models;

import java.time.LocalDate;
import java.util.Date;

public class Student {

	private String id;
	private String name;
	private LocalDate birthOfDate;
	private String gender;

	public Student() {
		super();
	}

	public Student(String id, String name, LocalDate birthOfDate, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.birthOfDate = birthOfDate;
		this.gender = gender;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthOfDate() {
		return birthOfDate;
	}

	public void setBirthOfDate(LocalDate birthOfDate) {
		this.birthOfDate = birthOfDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", birthOfDate=" + birthOfDate + ", gender=" + gender + "]";
	}

}
