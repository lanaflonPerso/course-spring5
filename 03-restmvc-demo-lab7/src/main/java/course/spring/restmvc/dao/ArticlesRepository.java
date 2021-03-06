package course.spring.restmvc.dao;

import course.spring.restmvc.model.Article;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArticlesRepository extends MongoRepository<Article, String> {

}
