package com.joel.bds03.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joel.bds03.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
