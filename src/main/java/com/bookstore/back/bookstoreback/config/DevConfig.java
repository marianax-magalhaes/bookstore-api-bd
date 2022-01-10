package com.bookstore.back.bookstoreback.config;

import com.bookstore.back.bookstoreback.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevConfig {

    @Autowired
    private DbService dbService;

    @Bean
    public void instanciaDb(){
        this.dbService.instanciaDb();
    }
}
