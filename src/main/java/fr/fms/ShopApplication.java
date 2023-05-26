package fr.fms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.fms.dao.ArticleRepository;
import fr.fms.entities.Article;

@SpringBootApplication
public class ShopApplication implements CommandLineRunner {
	
	@Autowired
	ArticleRepository articleRepository;

	public static void main(String[] args) {
		SpringApplication.run(ShopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		 int ii = 150;
//		 int iii = 5;
//		for (int i = 0; i < 30; i++) {
//			if(ii == 20) {
//				ii = 5;
//			}else {
//			articleRepository.save(new Article(null, "Samsung S" + iii, ii));
//			ii += 10;
//			iii ++;
//			}
//		}
//		articleRepository.save(new Article(null, "Samsung S9", 350));
//		articleRepository.save(new Article(null, "Samsung S10", 500));
		
	}
	
	
	

}
