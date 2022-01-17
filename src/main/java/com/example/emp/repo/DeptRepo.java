package com.example.emp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.emp.entity.Dept;

public interface DeptRepo extends JpaRepository<Dept, Integer>{

}
