package com.bookstore.back.bookstoreback.service;

import com.bookstore.back.bookstoreback.domain.Categoria;
import com.bookstore.back.bookstoreback.exceptions.NotFoundException;
import com.bookstore.back.bookstoreback.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public Categoria findById(Integer id){
        Optional<Categoria> obj = repository.findById(id);
        return obj.orElseThrow(()-> new NotFoundException("Objeto não encontrado! Id: " +id+ ", tipo: " + Categoria.class.getName()));
    }
}
