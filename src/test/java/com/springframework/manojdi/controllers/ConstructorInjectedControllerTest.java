package com.springframework.manojdi.controllers;

import com.springframework.manojdi.services.ConstructorInjectedGreetingServiceImpl;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller = new ConstructorInjectedController(new ConstructorInjectedGreetingServiceImpl());

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}