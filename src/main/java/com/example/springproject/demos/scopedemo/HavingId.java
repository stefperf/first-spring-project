package com.example.springproject.demos.scopedemo;


public abstract class HavingId {
    private static final String selfName = HavingId.class.getSimpleName();
    private static int currentId = 1;
    private final int id;

    protected HavingId() {
        this.id = currentId;
        HavingId.currentId++;
    }

    public int getId() {
        return id;
    }

    public void printId() {
        var className = getClass().getSimpleName();
        System.out.printf("This instance of %s with subclass %s has id = %d%n", selfName, className, id);
    }
}
