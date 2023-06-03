package fr.fms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.fms.dao.ArticleRepository;
import fr.fms.dao.CategoryRepository;
import fr.fms.entities.Article;
import fr.fms.entities.Category;

@SpringBootApplication
public class ShopApplication implements CommandLineRunner {
	
	@Autowired
	ArticleRepository articleRepository;
	
	@Autowired
	CategoryRepository categoryRepository;
	
	

	public static void main(String[] args) {
		SpringApplication.run(ShopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		articleRepository.save(new Article(null, "Samsung S9", 350));
//		articleRepository.save(new Article(null, "Samsung", " S10", 500, 1));
//		Category smartphone = categoryRepository.save(new Category("Smartphone"));
//		Category ordinateur = categoryRepository.save(new Category("Ordinateur"));
//		Category tablette = categoryRepository.save(new Category("Tablete"));
//		Category imprimante = categoryRepository.save(new Category("Imprimante"));
//		Category camera = categoryRepository.save(new Category("Camera"));
//		Category television = categoryRepository.save(new Category("Television"));
//		Category telescope = categoryRepository.save(new Category("Telescope"));
//		Category gps = categoryRepository.save(new Category("Gps"));
//		Category enceinte = categoryRepository.save(new Category("Enceinte"));
		
//		 int ii = 150;
//		 int iii = 5;
//		for (int i = 0; i < 30; i++) {
//			if(ii == 20) {
//				ii = 5;
//			}else {
//			articleRepository.save(new Article(null, "Samsung", "S" + iii, 200 + ii, smartphone ));
//			articleRepository.save(new Article(null, "Lenovo", "Novo-12" + iii, 2055 + ii, ordinateur ));
//			articleRepository.save(new Article(null, "Apple", "A" + iii, 423 + ii, tablette ));
//			articleRepository.save(new Article(null, "Epson", "SureColor-56" + iii, 1200 + ii, imprimante ));
//			articleRepository.save(new Article(null, "Thomson", "Rheita 2" + iii, 189 + ii, camera ));
//			articleRepository.save(new Article(null, "Continental", "Edison C19B" + iii, 1200 + ii, television ));
//			articleRepository.save(new Article(null, "Omegon", "AC 60/7" + iii, 677 + ii, telescope ));
//			articleRepository.save(new Article(null, "Garmin", " Drive 61 LMT-S5" + iii, 344 + ii, gps ));
//			articleRepository.save(new Article(null, "Audiodesk", "Live 257/256 CB12" + iii, 766 + ii, enceinte ));
//			ii += 10;
//			iii ++;
//			}
//		}
	}
}

