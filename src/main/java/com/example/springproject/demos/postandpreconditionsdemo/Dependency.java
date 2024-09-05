package com.example.springproject.demos.postandpreconditionsdemo;

import org.springframework.stereotype.Component;

@Component
public class Dependency {
    public Dependency() {
        System.out.println("Dependency created");
    }
}
