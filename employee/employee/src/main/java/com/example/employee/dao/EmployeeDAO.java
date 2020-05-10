package com.example.employee.dao;

import com.example.employee.model.Address;
import com.example.employee.model.Employee;

public interface EmployeeDAO {

	public Long addEmployee(Employee employee);
	public void updateEmployee(Long id, Address address);
	public void deleteEmployee(Long id);
}
