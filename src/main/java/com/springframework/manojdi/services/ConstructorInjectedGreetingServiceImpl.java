package com.springframework.manojdi.services;

public class ConstructorInjectedGreetingServiceImpl implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello world! - Constructor";
    }
}
