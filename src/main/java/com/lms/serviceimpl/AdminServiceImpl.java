package com.lms.serviceimpl;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.entity.AdminEntity;
import com.lms.entity.StudentEntity;
import com.lms.model.AdminSignUpMV;
import com.lms.model.AdminSignUpVM;
import com.lms.model.StudentMV;
import com.lms.model.StudentVM;
import com.lms.repository.AdminRepository;
import com.lms.repository.StudentRepository;
import com.lms.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository adminRepository;

	@Autowired
	private ModelMapper lmsmapper;

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public AdminSignUpMV adminSignUp(AdminSignUpVM adminLoginVM) {
		AdminEntity adminEntity = lmsmapper.map(adminLoginVM, AdminEntity.class);

		adminEntity = adminRepository.save(adminEntity);
		return lmsmapper.map(adminEntity, AdminSignUpMV.class);
	}

	@Override
	public StudentMV studentSignUp(StudentVM studentVM) {
		StudentEntity studentEntity = lmsmapper.map(studentVM, StudentEntity.class);
		studentEntity = studentRepository.save(studentEntity);
		return lmsmapper.map(studentEntity, StudentMV.class);
	}

	@Override
	public List<AdminSignUpMV> adminCheck(long adminId, String adminPassword) {
		List<AdminEntity> security = adminRepository.findByAdminIdAndAdminPassword(adminId, adminPassword);
		Type listType = new TypeToken<List<AdminEntity>>() {
		}.getType();
		return lmsmapper.map(security, listType);
	}
}
