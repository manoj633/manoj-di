package com.springframework.manojdi.services;

public class SetterInjectedGreetingServiceimpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world! - Setter";
    }
}
