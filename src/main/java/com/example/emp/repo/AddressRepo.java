package com.example.emp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.emp.entity.Address;

@Repository
public interface AddressRepo {
	public interface EmployeeRepo extends JpaRepository<Address, Integer>{	
	}
}
