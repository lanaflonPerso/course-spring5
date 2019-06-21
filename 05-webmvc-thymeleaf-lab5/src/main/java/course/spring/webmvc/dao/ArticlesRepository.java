package course.spring.webmvc.dao;

import course.spring.webmvc.model.Article;

import java.util.List;
import java.util.Optional;

public interface ArticlesRepository {
    List<Article> findAll();
    Optional<Article> findById(String id);
}