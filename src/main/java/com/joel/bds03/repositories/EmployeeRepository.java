package com.joel.bds03.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joel.bds03.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
