package com.spring.boot.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.model.Employee;
import com.spring.boot.service.EmployeeService;

@Controller

public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	/*
	 * @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate dob1;
	 */
	
	@PostMapping("/employee")
	public String registerEmployee(@ModelAttribute Employee emp,Model m)
	{
		Employee saveEmp=service.save(emp);
		m.addAttribute("emp",saveEmp);
		return "view1";
		
	}
	
	@GetMapping("/ename")
		public String gettname(@RequestParam("empName") String empName,Model m)
		{
		   Employee empname=service.getbname(empName);
		   m.addAttribute("empn",empname);
		   return "view";
	     }
	
	@GetMapping("/empbyid")
	public String getemp(@RequestParam("empId") int empid,Model m)
	{
	   Employee empname=service.getEmployee(empid);
	   m.addAttribute("empn",empname);
	   return "view";
     }

	@GetMapping("/delete")
	public String delete(@RequestParam("empid")int empId,Model m)
	{
		Employee emp=service.getEmployee(empId);
		service.deleteEmployee(empId);
	    m.addAttribute("empd",emp);
		return "deletedemp";
	}
	
	@PostMapping("/getAll")
	public String getAllEmp(Model m)
	{
		List<Employee> empList=service.getAllEmployee();
		m.addAttribute("Allemp",empList);	
		return "getallemp";
		
	}
	
	@GetMapping("/update")
	public String update(@RequestParam("empid") int empId,Model m)
	{
		Employee emp=service.getEmployee(empId);
		if(emp!=null)
		{
			 m.addAttribute("empd",emp);
		     return "updateemp";
		}
		else
			return "failure";
		
	}
	
	
	@GetMapping("/updateemp")
	public String updateemp(@ModelAttribute("emp")Employee emp,@RequestParam("empname")String empname,@RequestParam("sal")float sal,@RequestParam("empid")int empId,@RequestParam("dob")@DateTimeFormat(pattern="yyyy-MM-dd") LocalDate dob,Model m)
	{
		emp.setEmpId(empId);
		emp.setEmpName(empname);
		emp.setSalary(sal);
		emp.setDob(dob);
		service.updatee(emp,empId);
		return "successful";
		
	}
	
	
	
}
