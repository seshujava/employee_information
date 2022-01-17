package com.example.emp.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Employee {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private Integer sal; 
	
	@ManyToOne
	@JoinColumn(name = "dept_id")
	private Dept dept;
	
	@OneToMany(mappedBy = "emp", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Address> address;	
}
