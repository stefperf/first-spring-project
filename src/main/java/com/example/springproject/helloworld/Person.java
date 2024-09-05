package com.example.springproject.helloworld;

record Person(String name, String surname) {
    public String getFullName() {
        return this.name + " " + this.surname;
    }
}
