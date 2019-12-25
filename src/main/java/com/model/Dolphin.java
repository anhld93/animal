package com.model;

import com.interfaces.AnimalCanSwim;

public class Dolphin implements AnimalCanSwim {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private AnimalCanSwim animalCanSwim;

    public Dolphin(AnimalCanSwim animalCanSwim) {
        this.animalCanSwim = animalCanSwim;
    }

    public void swim() {
        animalCanSwim.swim();
    }
}
