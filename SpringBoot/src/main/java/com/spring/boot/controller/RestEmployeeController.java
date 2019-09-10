package com.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.model.Employee;
import com.spring.boot.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class RestEmployeeController {
	@Autowired
	EmployeeService service;
	
	@GetMapping("/employees")
	public List<Employee> getAEmp() {
		return service.getAllEmployee();
		
	}
	
	@GetMapping("/employees/{empId}")
	public Employee getOEmp(@PathVariable("empId") int empid)
	{
	   return service.getEmployee(empid);
     }
	
	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee emp) throws Exception {
		return service.save(emp);
	}
	
	@DeleteMapping("/employees/{empId}")
	public boolean  deleteEmp(@PathVariable("empId") int empId)
	{
		return service.delete(empId);
	}
    
	@PutMapping("/employees/{empId}")
	public Employee upEmployee(@RequestBody Employee emp) throws Exception {
		
		return service.updateemp(emp);
	}

}
