package com.example.springproject.lazydemo;

import org.springframework.stereotype.Component;

@Component
public class NormallyEagerComponent implements DoingSomething {
    public NormallyEagerComponent() {
        System.out.println("NormallyEagerComponent constructor being called");
    }
}
