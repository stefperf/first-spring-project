package com.example.springproject.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldApp {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(Configuration.class)) {
            var primaryPerson = context.getBean(Person.class);
            System.out.printf("I am %s%n", primaryPerson);

            var person2 = context.getBean("husband");
            System.out.println("My husband is " + person2);
        }
    }
}