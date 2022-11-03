package com.example.eventtest;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class PizzaEvent extends ApplicationEvent {

    private String pizzaName;
    private String flavor;

    public PizzaEvent(Object source, String pizzaName, String flavor){
        super(source);
        this.pizzaName = pizzaName;
        this.flavor = flavor;
    }

}
