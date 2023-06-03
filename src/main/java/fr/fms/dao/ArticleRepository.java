package fr.fms.dao;





import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.fms.entities.Article;


public interface ArticleRepository  extends JpaRepository<Article, Long> {
	
	Page<Article> findByBrandContains(String kw, Pageable pageable);
	
	//@Query("select c from article c where c.category.id = :x")
	
	Page<Article> findByCategoryId(@Param("x") Long id, Pageable pageable);
	

	

}