package com.example.greeting_rest;

public class Greeting {
    private long id;
    private String greeting;

    public Greeting(long id, String greeting) {
        this.id = id;
        this.greeting = greeting;
    }

    public long getId() {
        return this.id;
    }

    public String getGreeting() {
        return this.greeting;
    }
}
