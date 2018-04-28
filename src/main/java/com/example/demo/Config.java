package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.hibernate.search.jpa.FullTextEntityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManager;

import static org.hibernate.search.jpa.Search.getFullTextEntityManager;

@Slf4j
@Configuration
@EnableTransactionManagement
public  class Config {

    @Bean
    FullTextEntityManager ftem (EntityManager entityManager) {
        return getFullTextEntityManager(entityManager);
    }
}
