package com.lms.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "adminLogin")
public class AdminEntity {


	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long adminId;

	@Column(name = "adminName")
	private String adminName;

	@Column(name = "emailId")
	private String emailId;

	@Column(name = "mobileNumber")
	private long mobileNumber;

	@Column(name = "adminPassword")
	private String adminPassword;

	public long getAdminId() {
		return adminId;
	}

	public void setAdminId(long adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public AdminEntity(long adminId, String adminName, String emailId, long mobileNumber, String adminPassword) {

		this.adminId = adminId;
		this.adminName = adminName;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.adminPassword = adminPassword;
	}
	
	public AdminEntity() {
		
	}
}
