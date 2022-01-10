package com.bookstore.back.bookstoreback;

import com.bookstore.back.bookstoreback.domain.Categoria;
import com.bookstore.back.bookstoreback.domain.Livro;
import com.bookstore.back.bookstoreback.repository.CategoriaRepository;
import com.bookstore.back.bookstoreback.repository.LivroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class BookstorebackApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private LivroRepository livroRepository;

	public static void main(String[] args) {
		SpringApplication.run(BookstorebackApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria categoria1 = new Categoria(null,"Informática", "Livros de TI");
		Livro livro1 = new Livro(null, "Clean Code", "R.Martin", "lorem ipsum", categoria1);

		categoria1.getLivros().addAll(Arrays.asList(livro1));

		this.categoriaRepository.saveAll(Arrays.asList(categoria1));
		this.livroRepository.saveAll(Arrays.asList(livro1));
	}


}
