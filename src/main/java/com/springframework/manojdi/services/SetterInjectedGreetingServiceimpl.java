package com.springframework.manojdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingServiceimpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world! - Setter";
    }
}
