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
@Table(name = "Registration1")
@EntityListeners(AuditingEntityListener.class) // this is added so that that teh created and updated by fields will be
												// populated automatically by JPA
@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)
public class Register implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="Register_number")
	private long Register_number;

	@Override
	public String toString() {
		return "Register [Register_number=" +Register_number  + ", Name=" + Name + ", BranchName=" + branch_name + ",DateofBirth="+date_of_birth +",Yearofpassing12th="+Yearofpassing12th+",Marks="+Marks+",NssCadet="+nss_cadet+","
				+ "Address="+Address+",EmailAddress="+email_address+", fees="+fees+", createdAt=" + createdAt + ", updatedAt="+ updatedAt + "]";
	}
	@Column (name="Name")
	private String Name;
	@Column (name="branch_name")
	private String branch_name;
	@Column (name="date_of_birth")
	private String date_of_birth;
	@Column (name="Yearofpassing12th")
	private  String Yearofpassing12th;
	@Column (name="Marks")
	private int Marks;
	@Column (name="nss_cadet")
	private String nss_cadet;
	@Column (name="Address")
	private String Address;
	@Column (name="email_address")
	private String email_address;
	@Column (name="fees")
	private int fees;
	

	@Column(nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date createdAt;

	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date updatedAt;

	public long getRegister_number() {
		return Register_number;
	}

	public void setRegister_number(long register_number) {
		Register_number = register_number;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getBranch_name() {
		return branch_name;
	}

	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}

	public String getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getYearofpassing12th() {
		return Yearofpassing12th;
	}

	public void setYearofpassing12th(String yearofpassing12th) {
		Yearofpassing12th = yearofpassing12th;
	}

	public int getMarks() {
		return Marks;
	}

	public void setMarks(int marks) {
		Marks = marks;
	}

	public String getNss_cadet() {
		return nss_cadet;
	}

	public void setNss_cadet(String nss_cadet) {
		this.nss_cadet = nss_cadet;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getEmail_address() {
		return email_address;
	}

	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
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