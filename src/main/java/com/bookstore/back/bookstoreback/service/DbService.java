package com.bookstore.back.bookstoreback.service;

import com.bookstore.back.bookstoreback.domain.Categoria;
import com.bookstore.back.bookstoreback.domain.Livro;
import com.bookstore.back.bookstoreback.repository.CategoriaRepository;
import com.bookstore.back.bookstoreback.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DbService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private LivroRepository livroRepository;

    public void instanciaDb(){
        Categoria categoria1 = new Categoria(null,"Informática", "Livros de TI");
        Categoria categoria2 = new Categoria(null,"Mistério", "Livros Ficção");
        Categoria categoria3 = new Categoria(null,"Documentários", "Livros baseados em histórias reais");

        Livro livro1 = new Livro(null, "Clean Code", "R.Martin", "lorem ipsum", categoria1);
        Livro livro2 = new Livro(null, "Sherlock Holmes", "Arthur Conan Doyle", "lorem ipsum", categoria2);
        Livro livro3 = new Livro(null, "Arsene Lupin", "Maurice LeBlanc", "lorem ipsum", categoria2);
        Livro livro4 = new Livro(null, "Carandiru", "Drauzio Varela", "lorem ipsum", categoria3);
        Livro livro5 = new Livro(null, "Java para Dummies", "Barry Burd", "lorem ipsum", categoria1);

        categoria1.getLivros().addAll(Arrays.asList(livro1, livro5));
        categoria2.getLivros().addAll(Arrays.asList(livro2, livro3));
        categoria3.getLivros().addAll(Arrays.asList(livro4));

        this.categoriaRepository.saveAll(Arrays.asList(categoria1, categoria2, categoria3));
        this.livroRepository.saveAll(Arrays.asList(livro1, livro2, livro3, livro4, livro5));
    }
}














