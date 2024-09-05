package com.example.springproject.demos.lazydemo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LazyComponent implements DoingSomething {
    public LazyComponent() {
        System.out.println("LazyComponent constructor being called");
    }
}
