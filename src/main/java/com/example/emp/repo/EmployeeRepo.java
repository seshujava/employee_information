package com.example.emp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.emp.dto.EmployeeResponse;
import com.example.emp.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
	
	@Query("select new com.example.emp.dto.EmployeeResponse(e.name, e.sal) from Employee e")
			public List<EmployeeResponse> empFields();

	}
