package com.example.eventtest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PizzaEventHandler {

    @EventListener
    public void onPizzaEventListener(PizzaEvent pizzaEvent){
        log.info("시킨 피자는 {}의 {}맛", pizzaEvent.getPizzaName(),pizzaEvent.getFlavor());
    }


}
