package com.model;

import com.interfaces.AnimalCanFly;
import com.interfaces.AnimalCanSing;
import com.interfaces.AnimalCanWalk;

public class Bird implements AnimalCanFly, AnimalCanWalk, AnimalCanSing {
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

    public void walk() {
        System.out.println("I can walk");
    }

    public void sing() {
        System.out.println("I can sing");
    }
}
