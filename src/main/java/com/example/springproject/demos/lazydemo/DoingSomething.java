package com.example.springproject.demos.lazydemo;

public interface DoingSomething {
    default void doSomething() {
        System.out.println(this.getClass().getSimpleName() + " doing something");
    }
}
