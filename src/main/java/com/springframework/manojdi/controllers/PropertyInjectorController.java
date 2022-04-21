package com.springframework.manojdi.controllers;

import com.springframework.manojdi.services.ConstructorInjectedGreetingServiceImpl;
import com.springframework.manojdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectorController {

    @Qualifier("propertyInjectedGreetingServiceimpl")
    @Autowired
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

}
