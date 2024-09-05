package com.example.springproject.demos.postandpreconditionsdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Demo {
    public static void main(final String[] args) {
        try (final var context = new AnnotationConfigApplicationContext(SpringConfiguration.class)) {
            System.out.println("Spring Context created");
            context.getBean(ComponentWithPreAndPostConditions.class);
            System.out.println("Exiting...");
        }
    }
}
