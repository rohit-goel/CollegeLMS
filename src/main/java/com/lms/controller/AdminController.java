package com.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lms.model.AdminSignUpMV;
import com.lms.model.AdminSignUpVM;
import com.lms.model.StudentMV;
import com.lms.model.StudentVM;
import com.lms.service.AdminService;

@RestController
@CrossOrigin
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private AdminService adminService;

	@PostMapping
	public AdminSignUpMV adminSignUp(@RequestBody AdminSignUpVM adminSignVM) {
		return adminService.adminSignUp(adminSignVM);
	}

	@PostMapping("/studentregister")
	public StudentMV studentSignUp(@RequestBody StudentVM studentVM) {
		return adminService.studentSignUp(studentVM);
	}

	@GetMapping("/login/{adminId}/{adminPassword}")
	public List<AdminSignUpMV> adminCheck(@PathVariable long adminId, @PathVariable String adminPassword) {
		return adminService.adminCheck(adminId, adminPassword);
	}

}
