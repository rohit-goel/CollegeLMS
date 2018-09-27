package com.lms.service;

import java.util.List;

import com.lms.model.AdminSignUpMV;
import com.lms.model.AdminSignUpVM;
import com.lms.model.StudentMV;
import com.lms.model.StudentVM;

public interface AdminService {
	AdminSignUpMV adminSignUp(AdminSignUpVM adminLogin);

	StudentMV studentSignUp(StudentVM studentVM);

	List<AdminSignUpMV> adminCheck(long adminId, String adminPassword);
}