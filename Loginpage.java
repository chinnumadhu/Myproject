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
@Table(name = "LoginPage1")
@EntityListeners(AuditingEntityListener.class) // this is added so that that teh created and updated by fields will be
												// populated automatically by JPA
@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)
public class Loginpage implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int number;

	@Override
	public String toString() {
		return "Loginpage [number=" +number  + ", UserName=" + UserName + ", Password=" + Password + ", createdAt=" + createdAt + ", updatedAt="+ updatedAt + "]";
	}
	@NotBlank
	private String UserName;
	@NotBlank
	private String Password;
	

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
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
	@Column(nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date createdAt;

	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date updatedAt;


	// Getters and Setters ... (Omitted for brevity)
}