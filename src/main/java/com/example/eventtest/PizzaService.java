package com.example.eventtest;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PizzaService {

    //private final PizzaEventPublisher pizzaEventPublisher;

    private final ApplicationEventPublisher eventPublisher;
    public void pizzaCreate(){
        eventPublisher.publishEvent(new PizzaEvent(this,"반올림","불벅"));
    }

}
