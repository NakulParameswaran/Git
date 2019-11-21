package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.bean.Login;

@Controller
public class DemoController {
	@GetMapping("/")
	public void show() {
		System.out.print("Hello");
	}
	@GetMapping("start")
	public String start() {
		return "index";

}
	@PostMapping("insert")
		public String regdetails(Login login) {
		System.out.print(login.getUname());
		System.out.print(login.getPassword());
			return "success";
			
		
	}
}