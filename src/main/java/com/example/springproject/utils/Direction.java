package com.example.springproject.utils;

public enum Direction {
    UP("up"),
    DOWN("down"),
    LEFT("left"),
    RIGHT("right");

    private final String lowercase;

    Direction(final String lowercase) {
        this.lowercase = lowercase;
    }

    public String getLowercase() {
        return this.lowercase;
    }

    public String getUpppercase() {
        return this.lowercase.toUpperCase();
    }
}
