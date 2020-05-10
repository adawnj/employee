package com.example.employee.service;

import com.example.employee.model.Address;
import com.example.employee.model.Employee;

public interface EmployeeService {
	
	public Long addEmployee(Employee employee) throws Exception;
	public void updateEmployee(Long id, Address address) throws Exception;
	public void deleteEmployee(Long id) throws Exception;
}
