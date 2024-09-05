package com.example.springproject.scopedemo;


public abstract class HavingId {
    private static final String selfName = HavingId.class.getSimpleName();
    private static int currentId = 1;
    private final int id;

    protected HavingId() {
        id = HavingId.currentId;
        currentId++;
    }

    public int getId() {
        return this.id;
    }

    public void printId() {
        final var className = this.getClass().getSimpleName();
        System.out.printf("This instance of %s with subclass %s has id = %d%n", HavingId.selfName, className, this.id);
    }
}
