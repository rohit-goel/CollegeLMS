package com.lms.service;

import java.util.List;

import com.lms.model.StudentMV;

public interface StudentService {

	List<StudentMV> userSign(long studentId, String studentPassword);

	List<StudentMV> studentdata();

}
