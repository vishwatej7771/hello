package com.example.demo.resolver;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import com.example.demo.model.Employee;
import com.example.demo.model.AddEmployeeInput;
import com.example.demo.service.EmployeeService;

@Controller
public class QueryResolver {

	@Autowired
	private EmployeeService employeeService;

	@QueryMapping
	public String hello() {
		return "hello java";
	}

	@QueryMapping
	public List<Employee> findAll() {
		return employeeService.findall();
	}

	@QueryMapping
	public Employee findBymobile(@Argument String mobile) {

		return employeeService.findBymobile(mobile);
	}

	@QueryMapping
	public Employee findByid(@Argument Integer id) {
		return employeeService.findbyid(id);

	}

	@MutationMapping
	public Employee saveEmp(@Argument AddEmployeeInput addEmployeeInput) {
		return employeeService.saveEmployee(addEmployeeInput);
	}
	
	@QueryMapping
	public Employee checkData(@Argument String city, @Argument String mobile, @Argument String address) {
		
		return employeeService.findByCityAndMobileAndAddress(city, mobile, address);
	}
	
	
}
