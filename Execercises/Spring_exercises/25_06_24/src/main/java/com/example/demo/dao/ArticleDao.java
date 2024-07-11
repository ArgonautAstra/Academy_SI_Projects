package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Article;

// CrudRepository give methods to...

public interface ArticleDao extends CrudRepository<Article, Integer> {
	
}
