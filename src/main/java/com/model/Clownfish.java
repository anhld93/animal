package com.model;

public class Clownfish extends Fish {
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void specialCharacter() {
        System.out.println("I'm small and colorful. I make joke");
    }
}
