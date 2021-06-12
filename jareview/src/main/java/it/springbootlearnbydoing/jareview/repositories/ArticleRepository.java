package it.springbootlearnbydoing.jareview.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.springbootlearnbydoing.jareview.entities.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

}
