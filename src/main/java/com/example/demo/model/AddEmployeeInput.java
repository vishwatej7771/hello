package com.example.demo.model;

import jakarta.persistence.Column;
import lombok.Value;

@Value
public class AddEmployeeInput {
    
	@Column(name="employeenamme")
	private String employeenamme;
	
	@Column(name="city")
	public String city;
	
	@Column(name="mobile")
	private String mobile;
	
	@Column(name="address")
	private String address;
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmployeenamme() {
		return employeenamme;
	}
	public void setEmployeenamme(String employeenamme) {
		this.employeenamme = employeenamme;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}
