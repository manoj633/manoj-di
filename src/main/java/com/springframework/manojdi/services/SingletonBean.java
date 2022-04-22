package com.springframework.manojdi.services;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("Creating single ton bean!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    public String getMyScope() {
        return "My scope is singleton";
    }
}
