package com.example.springproject.helloworld;

import com.example.springproject.utils.Movable;
import com.example.springproject.utils.Mover;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.example.springproject.utils")
public class MyConfiguration {
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
        return new Person(this.name1(), this.surname1());
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
    public Person person(final String name2, @Qualifier("husbandSurname") final String surname) {
        return new Person(name2, surname);
    }

    @Bean
    @Qualifier("wolfQualifier")
    public Mover wolfMover(@Qualifier("wolfQualifier") final Movable movable) {
        return new Mover(movable);
    }
}
