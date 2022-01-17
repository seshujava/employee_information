package com.example.emp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.emp.dto.EmployeeResponse;
import com.example.emp.entity.Dept;
import com.example.emp.entity.Employee;
import com.example.emp.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class EmpController {
    //private static final Logger logger = LoggerFactory.getLogger(DemoController.class);

	@Autowired
	private EmployeeService employeeService;
	
	/***
	 * Sample API
	 * 
	 */
	@GetMapping("/employee")
	public List<Employee> empList() {
		log.info("-----All Employies list------");
        return employeeService.empList();
	}
	
	@GetMapping("/empfields")
	public List<EmployeeResponse> empFields(){
        return employeeService.empFields();
	}
	
	@GetMapping("/employee/{id}")
	public Optional<Employee> empList(@PathVariable Integer id) {
        	return employeeService.empList(id);
	}
	
	@GetMapping("/dept")
	public List<Dept> deptList() {
		 return employeeService.deptList();
	}
	
}
