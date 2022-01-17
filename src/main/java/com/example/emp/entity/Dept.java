package com.example.emp.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
@Data
@Entity
public class Dept {
	@Id
	@GeneratedValue
	@JsonIgnore
	private Integer id;
	private String name;
	
	@OneToMany(mappedBy = "dept", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Employee> emp;
	
	@JsonIgnore
	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}
		
}
