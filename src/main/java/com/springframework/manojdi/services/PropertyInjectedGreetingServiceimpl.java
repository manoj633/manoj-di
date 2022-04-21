package com.springframework.manojdi.services;

public class PropertyInjectedGreetingServiceimpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world! - Property";
    }
}
