package com.model;

import com.interfaces.AnimalCanSay;
import com.interfaces.AnimalCanWalk;

public class Chicken implements AnimalCanWalk, AnimalCanSay {

    private String name;

    public void walk() {
        System.out.println("I can walk");
    }

    public void says() {
        System.out.println("Cluck, cluck");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
