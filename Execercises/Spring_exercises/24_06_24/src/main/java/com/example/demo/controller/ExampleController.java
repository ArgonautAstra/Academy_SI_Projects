package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.User;
import com.example.demo.service.ArticleService;
import com.example.demo.service.UserService;

import jakarta.validation.Valid;

@Controller
public class ExampleController {

	@Autowired
	private ArticleService list;
	
	@Autowired
	private UserService userService;

	@GetMapping
	public String getExample(Model model) {
		
		User user = new User();
		
		model.addAttribute("user",user);
		
		model.addAttribute("title","Home");
		
		model.addAttribute("name","Andrea");
		
		model.addAttribute("list",list.getCatalog());
		
		return "index";
	}
	
	@PostMapping
	public String postExample(@Valid @ModelAttribute("user") User user, BindingResult result) {
		
		if(result.hasErrors()) {
			return "index";		
		}
		
		userService.signUp(user);
		
		return "redirect:/";
	}
	
}
