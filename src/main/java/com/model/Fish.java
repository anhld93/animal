package com.model;

import com.interfaces.AnimalCanSwim;

public class Fish implements AnimalCanSwim {

    private String name;

    public void swim() {
        System.out.println("I can swim");
    }

    public void specialCharacter(){};

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
