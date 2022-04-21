package com.springframework.manojdi.config;

import com.springframework.i18nservices.I18nEnglishGreetingService;
import com.springframework.manojdi.repositories.EnglishGreetingRepository;
import com.springframework.manojdi.repositories.EnglishGreetingRepositoryImpl;
import com.springframework.manojdi.services.ConstructorInjectedGreetingServiceImpl;
import com.springframework.manojdi.services.PrimaryGreetingService;
import com.springframework.manojdi.services.PropertyInjectedGreetingServiceimpl;
import com.springframework.manojdi.services.SetterInjectedGreetingServiceimpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructorInjectedGreetingServiceImpl constructorInjectedGreetingServiceImpl() {
        return new ConstructorInjectedGreetingServiceImpl();
    }

    @Bean
    PropertyInjectedGreetingServiceimpl propertyInjectedGreetingServiceimpl() {
        return new PropertyInjectedGreetingServiceimpl();
    }

    @Bean
    SetterInjectedGreetingServiceimpl setterInjectedGreetingServiceimpl() {
        return new SetterInjectedGreetingServiceimpl();
    }

    @Bean
    EnglishGreetingRepository englishGreetingRepository() {
        return new EnglishGreetingRepositoryImpl();
    }
    @Profile("EN")
    @Bean
    I18nEnglishGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository) {
        return new I18nEnglishGreetingService(englishGreetingRepository);
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService() {
        return new PrimaryGreetingService();
    }
}
