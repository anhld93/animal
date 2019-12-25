package com.model;

import com.interfaces.AnimalCanFly;
import com.interfaces.Insect;

public class Butterfly implements Insect, AnimalCanFly {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void fly() {
        System.out.println("I can fly");
    }
}
