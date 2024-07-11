package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Article;
import com.example.demo.service.ArticleServiceImpl;

@Controller
public class MainController {

	@Autowired
	private ArticleServiceImpl articleService;
	
	@GetMapping
	public String getMain(Model model) {
		
		model.addAttribute("title","Home");
		
		model.addAttribute("name","Andrea");
		
		List<Article> list = articleService.getArticles();
		
		model.addAttribute("list",list);
		
		return "index";
	}

	@GetMapping("/delete")
	public String deleteArticle(@RequestParam("id") int id) {
		articleService.deleteArticleById(id);
		
		return "redirect:/";
	}
}
