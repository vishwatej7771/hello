package com.example.demo.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.model.AddEmployeeInput;
import com.example.demo.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private ModelMapper mapper;

	@Override
	public List<Employee> findall() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee findBymobile(String mobile) {
		// TODO Auto-generated method stub
		return employeeRepository.findBymobile(mobile);
	}

	@Override
	public Employee findbyid(Integer id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id).get();
	}

	@Override
	public Employee saveEmployee(AddEmployeeInput addEmployeeInput) {
		Employee employee = mapper.map(addEmployeeInput, Employee.class);
		return employeeRepository.save(employee);
	}

	@Override
	public Employee findByCityAndMobileAndAddress(String city, String mobile, String address) {

		return employeeRepository.findByCityAndMobileAndAddress(city, mobile, address);

	}
}
