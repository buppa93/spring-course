package it.springbootlearnbydoing.jareview.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.springbootlearnbydoing.jareview.entities.Article;
import it.springbootlearnbydoing.jareview.repositories.ArticleRepository;
import it.springbootlearnbydoing.jareview.services.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {
	
	@Autowired
	private ArticleRepository articleRepo;

	@Override
	public List<Article> findAll() {
		return this.articleRepo.findAll();
	}

}
