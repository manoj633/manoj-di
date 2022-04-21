package com.springframework.manojdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingServiceimpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world! - Property";
    }
}
