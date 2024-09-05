package com.example.springproject.demos.postandpreconditionsdemo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentWithPreAndPostConditions {
    private Dependency dependency;

    public ComponentWithPreAndPostConditions() {
        System.out.println("ComponentWithPreAndPostConditions constructor executed");
    }

    @Autowired
    public void setDependency(final Dependency dependency) {
        this.dependency = dependency;
        System.out.println("Dependency injected");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Post-construct method executed");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Pre-destroy method executed");
    }
}
