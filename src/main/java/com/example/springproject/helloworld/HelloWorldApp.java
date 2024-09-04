package com.example.springproject.helloworld;

import com.example.springproject.utils.Mover;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldApp {

    public static void main(final String[] args) {
        try (final var context = new AnnotationConfigApplicationContext(MyConfiguration.class)) {
            final var primaryPerson = context.getBean(Person.class);
            System.out.printf("I am %s%n", primaryPerson);

            final var person2 = context.getBean("husband");
            System.out.println("My husband is " + person2);

            final var mover1 = context.getBean(Mover.class);
            mover1.circleClockwise(3);

            final var mover2 = context.getBean("wolfMover", Mover.class);
            mover2.circleCounterclockwise(4);
        }
    }
}