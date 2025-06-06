package com.example.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	 List<Employee> findByDepartmentId(Integer Id);
}
