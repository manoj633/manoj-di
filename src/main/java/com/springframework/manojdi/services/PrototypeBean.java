package com.springframework.manojdi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PrototypeBean {

    public PrototypeBean() {
        System.out.println("Prototype bean is created!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    public String getMyScope() {
        return "My scope is prototype";
    }
}
