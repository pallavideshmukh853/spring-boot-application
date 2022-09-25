package com.yash.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yash.entity.Employee;
@Service
public interface EmployeeService {

	public Employee getEmployeebyId(int empId);
	public List<Employee> getAllEmployee();
	public Employee addEmployee(Employee emp);
	public Employee modifyEmployee(Employee emp);
	public void deletebyEmployeeId(int empId);
}
