package com.yash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.Dao.EmployeeDao;
import com.yash.entity.Employee;

@Service
public class EmployeeServiceImpl implements  EmployeeService{

	@Autowired
	private EmployeeDao empdao;
	@Override
	public Employee getEmployeebyId(int empId) {
	Employee emp1 = empdao.findById(empId).get();
		return emp1;
	}

	@Override
	public List<Employee> getAllEmployee() {
		 return empdao.findAll();
	}

	@Override
	public Employee addEmployee(Employee emp) {
    Employee Semp = empdao.save(emp);
		return  Semp;
	}

	@Override
	public Employee modifyEmployee(Employee emp) {
	Employee empp =	empdao.save(emp);
		return empp;
	}

	@Override
	public  void deletebyEmployeeId(int empId) {
		empdao.deleteById(empId);
	}

}
