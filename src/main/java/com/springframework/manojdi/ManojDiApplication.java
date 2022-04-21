package com.springframework.manojdi;

import com.springframework.manojdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ManojDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ManojDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

//		String greetings = myController.sayHello();
//		System.out.println(greetings);

		System.out.println("---------------Primary Bean");
		System.out.println(myController.sayHello());
		System.out.println("---------------Property injected");
		PropertyInjectorController propertyInjectorController = (PropertyInjectorController) ctx.getBean("propertyInjectorController");
		System.out.println(propertyInjectorController.getGreeting());

		System.out.println("---------------Setter injected");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("---------------Constructor injected");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.getGreeting());

	}

}