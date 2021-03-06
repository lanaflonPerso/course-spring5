package org.iproduct.spring.restmvc.service;

import org.iproduct.spring.restmvc.model.Article;

import java.util.List;

public interface ArticleService {
    List<Article>  getArticles();
    Article addArticle(Article article);
    Article updateArticle(Article article);
    Article getArticleById(String id);
    Article deleteArticle(String id);
}
