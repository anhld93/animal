package com.model;

import com.interfaces.AnimalCanSay;

public class Parrot extends Bird implements AnimalCanSay {

    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    AnimalCanSay animalCanSay;

    public Parrot parrotLiveWithAnimal(AnimalCanSay animalCanSay) {
        this.animalCanSay = animalCanSay;
        return this;
    }

    public void says() {
        if (this.animalCanSay == null) {
            System.out.println("Don't know what to say");
        } else {
            this.animalCanSay.says();
        }
    }
}
