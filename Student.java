package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Registration")
@EntityListeners(AuditingEntityListener.class) // this is added so that that the created and updated by fields will be
												// populated automatically by JPA
@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)
public class Student implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="register_number")
	private long RegisterNumber;
	@Override
	public String toString() {
	return "Student [RegisterNumber=" +RegisterNumber  + ", BranchName=" + branch_name + ", Semester=" + Semester + ",DateofBirth="+dateof_birth +",AcademicMarks="+academic_marks +",SportsMarks="+sports_marks+",ArtsMarks="+arts_marks +",CulturalMarks="+cultural_marks+",Scholarship="+Scholarship+", Grade="+Grade+",Attendance="+Attendance+", createdAt=" + createdAt + ", updatedAt="+ updatedAt + "]";
	}

	@Column(name="branch_name")
	private String  branch_name;

	@Column(name="semester")
	private String Semester;
	@Column(name="dateof_birth")
	private String dateof_birth;
	@Column(name="academic_marks")
	private int academic_marks;
	@Column(name="sports_marks")
	private int sports_marks;
	@Column(name="arts_marks")
	private int arts_marks;
	@Column(name="cultural_marks")
	private int cultural_marks;
	@Column(name="scholarship")
	private String Scholarship;
	@Column(name="grade")
	private String Grade;
	@Column(name="attendance")
	private int Attendance;
	

	@Column(nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date createdAt;

	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date updatedAt;
	public long getRegisterNumber() {
		return RegisterNumber;
	}

	public void setRegisterNumber(long registerNumber) {
		RegisterNumber = registerNumber;
	}

	public String getBranch_name() {
		return branch_name;
	}

	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}

	public String getSemester() {
		return Semester;
	}

	public void setSemester(String semester) {
		Semester = semester;
	}

	public String getDateof_birth() {
		return dateof_birth;
	}

	public void setDateof_birth(String dateof_birth) {
		this.dateof_birth = dateof_birth;
	}

	public int getAcademic_marks() {
		return academic_marks;
	}

	public void setAcademic_marks(int academic_marks) {
		this.academic_marks = academic_marks;
	}

	public int getSports_marks() {
		return sports_marks;
	}

	public void setSports_marks(int sports_marks) {
		this.sports_marks = sports_marks;
	}

	public int getArts_marks() {
		return arts_marks;
	}

	public void setArts_marks(int arts_marks) {
		this.arts_marks = arts_marks;
	}

	public int getCultural_marks() {
		return cultural_marks;
	}

	public void setCultural_marks(int cultural_marks) {
		this.cultural_marks = cultural_marks;
	}

	public String getScholarship() {
		return Scholarship;
	}

	public void setScholarship(String scholarship) {
		Scholarship = scholarship;
	}

	public String getGrade() {
		return Grade;
	}

	public void setGrade(String grade) {
		Grade = grade;
	}

	public int getAttendance() {
		return Attendance;
	}

	public void setAttendance(int attendance) {
		Attendance = attendance;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
		

			
	// Getters and Setters ... (Omitted for brevity)
}