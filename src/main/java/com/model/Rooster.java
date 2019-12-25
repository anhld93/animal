package com.model;

import com.interfaces.AnimalCanSay;
import com.interfaces.AnimalCanWalk;

public class Rooster implements AnimalCanSay, AnimalCanWalk {

    private String name;
    private Chicken chicken;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private Rooster(){};

    public Rooster(Chicken chicken) {
        this.chicken = chicken;
    }

    public void says() {
        System.out.println("Cock-a-doodle-doo");
    }

    public void walk() {
        chicken.walk();
    }
}
