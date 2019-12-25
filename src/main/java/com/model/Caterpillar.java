package com.model;

import com.interfaces.AnimalCanWalk;
import com.interfaces.Insect;

public class Caterpillar implements Insect, AnimalCanWalk {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void walk() {
        System.out.println("I can crawl");
    }
}
