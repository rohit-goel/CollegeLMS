package com.lms.model;

import java.sql.Date;

public class StudentMV {
	private long studentId;
	private String studentName;
	private Date dob;
	private long mobileNumber;
	private String emailId;
	private long studId;
	private String studentPassword;
	private long fees;
	private long semester;
	private String trade;
	private String fatherName;
	private String motherName;

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

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

	public long getFees() {
		return fees;
	}

	public void setFees(long fees) {
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

}
