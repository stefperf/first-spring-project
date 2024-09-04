package com.example.springproject.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

record Person(String name, String surname) {
    public String getFullName() {
        return name + " " + surname;
    }
}

@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    public String name1() {
        return "Stefano";
    }

    @Bean
    public String surname1() {
        return "Perfetti";
    }

    @Bean
    @Primary
    public Person myself() {
        return new Person(name1(), surname1());
    }

    @Bean(name = "name2")
    public String name() {
        return "Luca";
    }

    @Bean(name = "surname2")
    @Qualifier("husbandSurname")
    public String surname() {
        return "Morreale";
    }

    @Bean(name = "husband")
    public Person person(String name2, @Qualifier("husbandSurname") String surname) {
        return new Person(name2, surname);
    }
}
