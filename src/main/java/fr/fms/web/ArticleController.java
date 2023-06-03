package fr.fms.web;



import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.fms.dao.ArticleRepository;
import fr.fms.dao.CategoryRepository;
import fr.fms.entities.Article;
import fr.fms.entities.Category;

@Controller
public class ArticleController {
	
	@Autowired
	ArticleRepository articleRepository;
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@GetMapping("/index")
	public String index(Model model,
			@RequestParam(name="page", defaultValue = "0")int page,
			@RequestParam(name="keyword", defaultValue = "") String kw,
		@RequestParam(name="categoryId", defaultValue = "0") Long categoryId
		) {
		
		Page<Article> articles = null;

		if(categoryId > 0 ) {
			
		
			articles = articleRepository.findByCategoryId(categoryId, PageRequest.of(page, 5));
		
		}else {		
		
			articles = articleRepository.findByBrandContains(kw, PageRequest.of(page, 5));
		}
		
		model.addAttribute("listCategory", categoryRepository.findAll());
		model.addAttribute("listArticle", articles.getContent());
		model.addAttribute("keyword", kw);
		model.addAttribute("pages", new int[articles.getTotalPages()]);
		model.addAttribute("currentPage", page);
		model.addAttribute("categoryId", categoryId);
		return "articles"; // cette méthode retourne au dispacterServlet
	}
	
	@GetMapping("/delete")
	public String delete(Long id, int page, String keyword) {
	//System.out.println("value : " + id);
	articleRepository.deleteById(id);
		return "redirect:/index?page="+page+"&keyword="+keyword;
	}
	
	@GetMapping("/article")
	public String article(Model model) {
		model.addAttribute("article", new Article());
		return "article";
	}
	
	@PostMapping("/save")
	public String save(Model model,@Valid Article article, BindingResult bindingResult) {
		System.out.println("article" + article);
		if(bindingResult.hasErrors()) return "article";
		articleRepository.save(article);
		return "article";
	}
}
