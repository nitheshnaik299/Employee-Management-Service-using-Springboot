package com.spring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AddController {
	@GetMapping("/add")
	public String add(@RequestParam("t1") int t1,@RequestParam("t2") int t2,Model m)
	{
		int sum=t1+t2;
		m.addAttribute("sum",sum);
		return "showResult";
		
	}
	
	@GetMapping("/")
	public String Default()
	{
		return "index";
	}
	

}
