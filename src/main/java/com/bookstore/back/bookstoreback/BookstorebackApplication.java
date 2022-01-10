package com.bookstore.back.bookstoreback;


import com.bookstore.back.bookstoreback.repository.LivroRepository;
import com.bookstore.back.bookstoreback.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class BookstorebackApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstorebackApplication.class, args);
	}

	DbService dbService = new DbService();
}
