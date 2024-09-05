package com.example.springproject.lazydemo;

public interface DoingSomething {
    default void doSomething() {
        System.out.println(getClass().getSimpleName() + " doing something");
    }
}
