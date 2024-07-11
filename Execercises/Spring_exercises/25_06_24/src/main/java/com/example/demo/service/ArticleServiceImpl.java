package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ArticleDao;
import com.example.demo.model.Article;

@Service
public class ArticleServiceImpl implements ArticleService{

	// Dependency injection of the component that interact with the DB
	
	@Autowired
	private ArticleDao articleDao;
	
	@Override
	public void setArticle(Article article) {
		
		// save() is a method of CrudeRepository
		
		System.out.println(article.toString());
		
		articleDao.save(article);
	}

	@Override
	public List<Article> getArticles() {
		
		// findAll() return a Iterable<>, so that will give an error because is see 
		// as something much bigger of a List, so we must cast the return.
		
		return (List<Article>) articleDao.findAll();
	}

	@Override
	public Article getArticleById(int id) {
		
		// findById() return a Optional<>, is a class that allow to manage the
		// the Dao is Null [...]
		
		Optional<Article> optional = articleDao.findById(id);
		
		if(optional.isPresent()) 
			return optional.get();
		
		return null;
	}

	@Override
	public void deleteArticleById(int id) {
		
		// articleDao.deleteById(id);
		
		Optional<Article> optional = articleDao.findById(id);
		
		if(optional.isPresent()) 
			articleDao.delete(optional.get());
	}
}
