package com.lms.model;

import java.security.SecureRandom;
import java.sql.Date;
import java.util.Random;

public class StudentVM {
	private String studentName;
	private Date dob;
	private long mobileNumber;
	private String emailId;
	private long studId;
	private String studentPassword = "";
	private long fees;
	private long semester;
	private String trade;
	private String fatherName;
	private String motherName;
	private long max = 5500;
	private long min = 5000;
	String CHAR_LIST = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

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
		studId = (long) ((Math.random() * ((max - min) + 1)) + min);
		return studId;
	}

	public String getStudentPassword() {
		final Random random = new SecureRandom();
		for (int i = 0; i < 10; i++) {
			int index = (int) (random.nextDouble() * CHAR_LIST.length());
			studentPassword += CHAR_LIST.substring(index, index + 1);
		}
		return studentPassword;
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
