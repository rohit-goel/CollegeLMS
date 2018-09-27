package com.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lms.model.StudentMV;
import com.lms.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/login/{studId}/{studentPassword}")
	public List<StudentMV> userSign(@PathVariable long studId, @PathVariable String studentPassword) {
		return studentService.userSign(studId, studentPassword);
	}

	@GetMapping("/details")
	public List<StudentMV> studentdata() {
		return studentService.studentdata();
	}
}
