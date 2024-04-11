package org.springboot.mvc;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {

	@Id
	@Column
	String stud_Id;
	@Column
	String stud_Name;
	@Column
	String stud_Course;

	public Student() {
		super();
	}

	public Student(String stud_Id, String stud_Name, String stud_Course) {
		super();
		this.stud_Id = stud_Id;
		this.stud_Name = stud_Name;
		this.stud_Course = stud_Course;
	}

	public String getStud_Id() {
		return stud_Id;
	}

	public void setStud_Id(String stud_Id) {
		this.stud_Id = stud_Id;
	}

	public String getStud_Name() {
		return stud_Name;
	}

	public void setStud_Name(String stud_Name) {
		this.stud_Name = stud_Name;
	}

	public String getStud_Course() {
		return stud_Course;
	}

	public void setStud_Course(String stud_Course) {
		this.stud_Course = stud_Course;
	}

	@Override
	public String toString() {
		return "Student [stud_Id=" + stud_Id + ", stud_Name=" + stud_Name + ", stud_Course=" + stud_Course + "]";
	}
}
