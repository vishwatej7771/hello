package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;
import com.example.demo.model.AddEmployeeInput;

public interface EmployeeService {

	public Employee saveEmployee(AddEmployeeInput addEmployeeInput);

	public Employee findBymobile(String mobile);

	public List<Employee> findall();

	public Employee findbyid(Integer id);

	public Employee findByCityAndMobileAndAddress(String city, String mobile, String address);

}
