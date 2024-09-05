package com.example.springproject.exercises.exercise1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Excercise1 {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(Exercise1Configuration.class)) {
            var bcs = context.getBean(BusinessCalculationService.class);
            System.out.println("Exercise - BusinessCalculationService:");
            System.out.printf("The max is %d.%n", bcs.findMax());
        }
    }
}
