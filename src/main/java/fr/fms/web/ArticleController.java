package fr.fms.web;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.fms.dao.ArticleRepository;
import fr.fms.entities.Article;

@Controller
public class ArticleController {
	
	@Autowired
	ArticleRepository articleRepository;
	
	@GetMapping("/index")
	public String index(Model model,
			@RequestParam(name="page" , defaultValue = "0")int page,
			@RequestParam(name="keyword", defaultValue = "") String kw) {
		
		Page<Article> articles = articleRepository.findByBrandContains(kw, PageRequest.of(page, 5));
	    articles.stream().forEach(System.out::println);
		
		model.addAttribute("listArticle", articles.getContent());
		model.addAttribute("keyword", kw);
		model.addAttribute("pages", new int[articles.getTotalPages()]);
		model.addAttribute("currentPage", page);
		return "articles"; // cette méthode retourne au dispacterServlet
	}
	
	@GetMapping("/delete")
	public String delete(Long id, int page, String keyword) {
	System.out.println("value : " + id);
		articleRepository.deleteById(id);
		
		return "redirect:/index?page="+page+"&keyword="+keyword;
		
	}

}
