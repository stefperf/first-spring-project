package com.example.springproject.utils;

public interface Movable {

    String getName();

    default String verb() {
        return "moves";
    }

    default void move(final Direction direction, final int nSteps) {
        System.out.printf("%s %s %s by %d steps%n", this.getName(), this.verb(), direction.getLowercase(), nSteps);
    }

}
