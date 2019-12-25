package com.model;

import com.interfaces.AnimalCanSay;
import com.interfaces.AnimalCanSwim;

public class Duck implements AnimalCanSwim, AnimalCanSay {

    private String name;

    public void says() {
        System.out.println("Quack, quack");
    }

    public void swim() {
        System.out.println("I can swim");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
