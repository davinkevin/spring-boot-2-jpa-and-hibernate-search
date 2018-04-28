package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.hibernate.search.jpa.FullTextEntityManager;
import org.springframework.stereotype.Service;

/**
 * Created by kevin on 28/04/2018
 */
@Service
@RequiredArgsConstructor
public class WondefulService {

    private final FullTextEntityManager ftem;
}
