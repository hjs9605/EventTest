package com.example.eventtest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationEventPublisher;

@SpringBootTest
public class EventTest {

    @Autowired
    private PizzaService pizzaService;

    @Test
    void 피자만들기(){

        pizzaService.pizzaCreate();


    }
}
