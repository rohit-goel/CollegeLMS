package com.lms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lms.entity.AdminEntity;

@Repository
public interface AdminRepository extends JpaRepository<AdminEntity, Long> {
	List<AdminEntity> findByAdminIdAndAdminPassword(long adminId, String adminPassword);
}