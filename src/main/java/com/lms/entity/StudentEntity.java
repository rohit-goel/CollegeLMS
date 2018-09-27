package com.lms.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "student")
public class StudentEntity {

	@NotNull
	@Column(name = "studentName")
	private String studentName;

	@NotNull
	@Column(name = "dob")
	private Date dob;

	@NotNull
	@Column(name = "mobileNumber")
	private long mobileNumber;

	@NotNull
	@Column(name = "emailId")
	private String emailId;

	@Id
	@NotNull
	@Column(name = "studId")
	private long studId;

	@Column(name = "studentPassword")
	private String studentPassword;

	@Column(name = "fees")
	private String fees;

	@Column(name = "semester")
	private long semester;

	@Column(name = "trade")
	private String trade;

	@Column(name = "fatherName")
	private String fatherName;

	@Column(name = "motherName")
	private String motherName;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "adminId")
	private AdminEntity adminEntity;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getStudId() {
		return studId;
	}

	public void setStudId(long studId) {
		this.studId = studId;
	}

	public String getStudentPassword() {
		return studentPassword;
	}

	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}

	public String getFees() {
		return fees;
	}

	public void setFees(String fees) {
		this.fees = fees;
	}

	public long getSemester() {
		return semester;
	}

	public void setSemester(long semester) {
		this.semester = semester;
	}

	public String getTrade() {
		return trade;
	}

	public void setTrade(String trade) {
		this.trade = trade;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public AdminEntity getAdminEntity() {
		return adminEntity;
	}

	public void setAdminEntity(AdminEntity adminEntity) {
		this.adminEntity = adminEntity;
	}

}
