package com.example.emp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.emp.dto.EmployeeResponse;
import com.example.emp.entity.Dept;
import com.example.emp.entity.Employee;
import com.example.emp.repo.DeptRepo;
import com.example.emp.repo.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Autowired
	private DeptRepo deptRepo;
	
	public List<EmployeeResponse> empFields(){
   	 return employeeRepo.empFields(); 
	}
	
	public List<Employee> empList(){
        	 //List<Employee> collect = emp.stream().filter(s->s.getSal()>50000).collect(Collectors.toList());
        	 return employeeRepo.findAll();        
	}
	
	public Optional<Employee> empList(Integer id) {
		// TODO Auto-generated method stub
		boolean existsById = employeeRepo.existsById(id);
		if(existsById) {
		return employeeRepo.findById(id);
		}else {
			return null;
		}
	}
	
	public List<Dept> deptList(){
		 return deptRepo.findAll();
	}

}
