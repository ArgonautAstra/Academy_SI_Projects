package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.service.ArticleService;
import com.example.demo.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private ArticleService list;
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/User")
	public String getUser(Model model) {
		
		model.addAttribute("title","Home");
		
		model.addAttribute("name","Andrea");
		
		model.addAttribute("list",list.getCatalog());
		
		return "index";
	}
	
	@PostMapping("/User")
	public String postMethodName() {
		
		return "redirect:/";
	}
}
