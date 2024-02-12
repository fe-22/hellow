package com.fthec.helloW.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class HelloWController {
	
	@GetMapping("/hellow")
	public String hellow(@RequestParam(name = "Danilo", required = false, defaultValue = "Cara")String name, Model model) {
		
		model.addAttribute("name", name);
		
		return "hellow";
		
	}
		
}
	
	
	


