package com.springframework.manojdi.config;

import com.springframework.i18nservices.I18nEnglishGreetingService;
import com.springframework.manojdi.datasource.FakeDataSource;
import com.springframework.manojdi.repositories.EnglishGreetingRepository;
import com.springframework.manojdi.repositories.EnglishGreetingRepositoryImpl;
import com.springframework.manojdi.services.ConstructorInjectedGreetingServiceImpl;
import com.springframework.manojdi.services.PrimaryGreetingService;
import com.springframework.manojdi.services.PropertyInjectedGreetingServiceimpl;
import com.springframework.manojdi.services.SetterInjectedGreetingServiceimpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@PropertySource("classpath:datasource.properties")
@ImportResource("classpath:manojdi-config.xml")
@Configuration
public class GreetingServiceConfig {

    @Bean
    FakeDataSource fakeDataSource(@Value("${com.username}") String username,@Value("${com.password}") String password,@Value("${com.jdbcURL}") String jdbcurl) {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(username);
        fakeDataSource.setPassword(password);
        fakeDataSource.setJdbcURL(jdbcurl);

        return fakeDataSource;
    }

    @Bean
    ConstructorInjectedGreetingServiceImpl constructorInjectedGreetingServiceImpl() {
        return new ConstructorInjectedGreetingServiceImpl();
    }

    @Bean
    PropertyInjectedGreetingServiceimpl propertyInjectedGreetingServiceimpl() {
        return new PropertyInjectedGreetingServiceimpl();
    }

    //configured from xml
//    @Bean
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
