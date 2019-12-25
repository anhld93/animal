package com.model;

import com.interfaces.Animal;
import com.interfaces.AnimalCanSay;
import com.interfaces.AnimalCanSwim;

import java.util.ArrayList;
import java.util.List;

public class ExampleModel {
    public static List<Animal> getAllAnimals(){
        List<Animal> animals = new ArrayList<Animal>();

        Animal bird = new Bird();
        bird.setName(Bird.class.getSimpleName());
        animals.add(bird);

        Animal chicken = new Chicken();
        chicken.setName(Chicken.class.getSimpleName());
        animals.add(chicken);

        Animal duck = new Duck();
        duck.setName(Duck.class.getSimpleName());
        animals.add(duck);

        Animal parrot = new Parrot();
        ((Parrot) parrot).parrotLiveWithAnimal((AnimalCanSay) duck);
        parrot.setName(Parrot.class.getSimpleName());
        animals.add(parrot);

        Animal fish = new Fish();
        fish.setName(Fish.class.getSimpleName());
        animals.add(fish);

        Animal shark = new Shark();
        shark.setName(Shark.class.getSimpleName());
        animals.add(shark);

        Animal clownfish = new Clownfish();
        clownfish.setName(Clownfish.class.getSimpleName());
        animals.add(clownfish);

        Animal dolphin = new Dolphin((AnimalCanSwim)fish);
        dolphin.setName(Dolphin.class.getSimpleName());
        animals.add(dolphin);

        Animal butterfly = new Butterfly();
        butterfly.setName(Butterfly.class.getSimpleName());
        animals.add(butterfly);

        Animal caterpillar = new Caterpillar();
        caterpillar.setName(Caterpillar.class.getSimpleName());
        animals.add(caterpillar);

        return animals;
    }
}
