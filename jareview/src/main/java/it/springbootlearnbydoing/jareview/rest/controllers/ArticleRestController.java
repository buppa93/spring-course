package it.springbootlearnbydoing.jareview.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.springbootlearnbydoing.jareview.entities.Article;
import it.springbootlearnbydoing.jareview.services.ArticleService;

@RestController
@RequestMapping("/article")
public class ArticleRestController {

	@Autowired
	private ArticleService articleService;
	
	@GetMapping("findAll")
	public List<Article> findAll() {
		return this.articleService.findAll();
	}
}
