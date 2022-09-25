package com.yash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yash.entity.Employee;
import com.yash.service.EmployeeService;

@RestController
@RequestMapping("/yashManagement")
public class EmployeeController {

	@Autowired
	private EmployeeService empser;
	
	@PostMapping("/save")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee emp){
		Employee employeesaved = empser.addEmployee(emp) ;
		return new ResponseEntity<Employee>(employeesaved,HttpStatus.CREATED) ;
	}
	@GetMapping("/all")
	public List<Employee> getAllEmployee(){
           List<Employee> getallemployee = empser.getAllEmployee();
           return getallemployee;
	}

	@GetMapping("/getEmployeeById/{getId}")
	public Employee getEmployee(@PathVariable("getId") int getId) {
		Employee employee = empser.getEmployeebyId(getId);
		return employee;
	}
	@DeleteMapping("/delete/{empId}")
	public void deletebyEmployeeId(@PathVariable("empId") int empId) {
		empser.deletebyEmployeeId(empId);
}
	@PutMapping("/update")
	public ResponseEntity<Employee> modifyEmployee(@RequestBody Employee emp) {
     Employee demp = empser.addEmployee(emp);
     return new ResponseEntity<Employee>(demp,HttpStatus.CREATED);
	}
}