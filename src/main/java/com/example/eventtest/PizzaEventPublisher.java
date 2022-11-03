package com.example.eventtest;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PizzaEventPublisher implements ApplicationRunner {


    private final ApplicationEventPublisher applicationEventPublisher;
    //ApplicationRunner로 해서 그런가 세상에서 다른거보다 제일 빨리 실행됨
    @Override
    public void run(ApplicationArguments args) throws Exception{
        System.out.println("Publishing");
        PizzaEvent pizzaEvent1 = new PizzaEvent(this, "banolim", "bulgogi");
        applicationEventPublisher.publishEvent(pizzaEvent1);
    }

}
