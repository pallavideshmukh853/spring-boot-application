package com.yash.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.entity.Employee;
@Repository
public interface EmployeeDao extends JpaRepository<Employee,Integer>{

}
