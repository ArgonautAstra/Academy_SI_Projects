package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Article;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Override
	public List<Article> getCatalog() {

		List<Article> list = new ArrayList<>();
		
		list.add(new Article(1,"Article_1",2.5f));
		list.add(new Article(2,"Article_2",5.0f));
		list.add(new Article(3,"Article_3",7.5f));
		list.add(new Article(4,"Article_4",10.0f));
		
		return list;
	}

}
