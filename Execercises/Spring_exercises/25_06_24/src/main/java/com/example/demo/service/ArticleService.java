package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Article;

public interface ArticleService {

	void setArticle(Article article);

	List<Article> getArticles();

	Article getArticleById(int id);
	
	void deleteArticleById(int id);
	
}
