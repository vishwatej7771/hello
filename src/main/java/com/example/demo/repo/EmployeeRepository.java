package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

@Repository // connect the database
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	 public Employee findBymobile(String mobile);
	 
	 public Employee findByCityAndMobileAndAddress(String city,String mobile,String address);
	 
}
