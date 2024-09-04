package com.example.springproject.helloworld;

import com.example.springproject.utils.Mover;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class HelloWorldApp {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(MyConfiguration.class)) {
            var primaryPerson = context.getBean(Person.class);
            System.out.printf("I am %s%n", primaryPerson);

            var person2 = context.getBean("husband");
            System.out.println("My husband is " + person2);

            var mover1 = context.getBean(Mover.class);
            mover1.circleClockwise(3);

            var mover2 = context.getBean("wolfMover", Mover.class);
            mover2.circleCounterclockwise(4);

            System.out.println("Bean names:");
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}