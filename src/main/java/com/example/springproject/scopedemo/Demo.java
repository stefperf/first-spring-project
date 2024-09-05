package com.example.springproject.scopedemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Demo {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(SpringConfiguration.class)) {
            context.getBean(NormallySingletonComponent.class).printId();
            context.getBean(PrototypeComponent.class).printId();
            context.getBean(NormallySingletonComponent.class).printId();
            context.getBean(PrototypeComponent.class).printId();
            context.getBean(NormallySingletonComponent.class).printId();
            context.getBean(PrototypeComponent.class).printId();
        }
    }
}
