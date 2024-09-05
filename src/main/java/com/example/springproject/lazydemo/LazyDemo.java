package com.example.springproject.lazydemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class LazyDemo {
    public static void main(final String[] args) {
        try (final var context = new AnnotationConfigApplicationContext(SpringConfiguration.class)) {
            System.out.println("Spring Context created");
            context.getBean(NormallyEagerComponent.class).doSomething();
            context.getBean(LazyComponent.class).doSomething();
        }
    }
}
