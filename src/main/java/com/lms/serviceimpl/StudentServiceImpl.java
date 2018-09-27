package com.lms.serviceimpl;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.entity.StudentEntity;
import com.lms.model.StudentMV;
import com.lms.repository.StudentRepository;
import com.lms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private ModelMapper lmsmapper;

	@Override
	public List<StudentMV> userSign(long studId, String studentPassword) {
		List<StudentEntity> studentEntity = studentRepository.findByStudIdAndStudentPassword(studId, studentPassword);
		Type listType = new TypeToken<List<StudentEntity>>() {
		}.getType();
		return lmsmapper.map(studentEntity, listType);
	}

	@Override
	public List<StudentMV> studentdata() {
		List<StudentEntity> details = studentRepository.findAll();
		Type listType = new TypeToken<List<StudentEntity>>() {
		}.getType();
		return lmsmapper.map(details, listType);
	}
}
