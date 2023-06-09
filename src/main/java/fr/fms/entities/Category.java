package fr.fms.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Category implements Serializable {
	

	
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	String name;
	
	@OneToMany(mappedBy = "category")
	private Collection<Article> articles;
	
//	public Category(Long id,String name) {
//		this.id = id;
//		this.name = name;
//	}
	
	public Category(String name) {
		this.name = name;
	}

}
