package com.spring.boot.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.model.Employee;
import com.spring.boot.repository.EmployeeReop;

@Service
public class EmployeeService {

	@Autowired
	EmployeeReop repo;

	public Employee save(Employee emp) {
		return repo.save(emp);
	}

	public Employee getEmployee(int empId) {
		return repo.getOne(empId);
	}

	public List<Employee> getAllEmployee() {
		return repo.findAll();
	}

	public void deleteEmployee(int empId) {
		repo.deleteById(empId);
	}

	public Employee getbname(String name) {
		return repo.getByName(name);
	}

	/*
	 * public void UpdateEmp(String empname,float sal,int empId,LocalDate dob) {
	 * 
	 * Employee emp=getEmployee(empId); if(emp==null)
	 * 
	 * repo.UpdateEmp(empname, sal, empId,dob);
	 * 
	 * }
	 */
	public Employee updatee( Employee emp,int empId)
	{
		
		Employee emp1=repo.getOne(emp.getEmpId());
		emp1.setEmpId(empId);
		emp1.setDob(emp.getDob());
		emp1.setEmpName(emp.getEmpName());
		emp1.setSalary(emp.getSalary());
		return repo.save(emp1);
	
	}

	public boolean delete(int empId) {
		// TODO Auto-generated method stub
		
		 repo.deleteById(empId);
		return true;
		
	}

	public Employee updateemp(Employee emp) {
		// TODO Auto-generated method stub
		Employee emp1=repo.getOne(emp.getEmpId());
		emp1.setEmpId(emp.getEmpId());
		emp1.setDob(emp.getDob());
		emp1.setEmpName(emp.getEmpName());
		emp1.setSalary(emp.getSalary());
		return repo.save(emp1);
	}

	
}
