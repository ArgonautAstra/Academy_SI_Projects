package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Article;
import com.example.demo.service.ArticleServiceImpl;

import jakarta.validation.Valid;


@Controller
@RequestMapping("/form")
public class FormController {

	@Autowired
	private ArticleServiceImpl articleService;

	@GetMapping
	public String getForm(Model model, @RequestParam(name = "id", required = false) Integer id) {
		
		model.addAttribute("title","Form");
		
		Article article = id == null ? new Article() : articleService.getArticleById(id);
		
		model.addAttribute("article", article);
		
		return "form";
	}

	@PostMapping
	public String postForm(@Valid @ModelAttribute("article") Article article, BindingResult result) {
		
		if(result.hasErrors()) 
			return "form";		
		
		articleService.setArticle(article);
		
		return "redirect:/";
	}
	
}
