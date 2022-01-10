package com.bookstore.back.bookstoreback.repository;

import com.bookstore.back.bookstoreback.domain.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer> {
}

