package com.service;

import com.dao.AnimalDao;
import com.interfaces.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {
    @Autowired
    AnimalDao animalDao;

    public List<Animal> getAll() {
        return animalDao.getAll();
    }

    public int getNumberOfAnimalCanFly(List<Animal> animals) {
        if(animals == null || animals.isEmpty()) return 0;
        int numberOfAnimalCanFly = 0;
        for(Animal animal: animals) {
            numberOfAnimalCanFly = animal instanceof AnimalCanFly ? numberOfAnimalCanFly + 1 : numberOfAnimalCanFly;
        }
        return numberOfAnimalCanFly;
    }

    public int getNumberOfAnimalCanWalk(List<Animal> animals) {
        if(animals == null || animals.isEmpty()) return 0;
        int numberOfAnimalCanWalk = 0;
        for(Animal animal: animals) {
            numberOfAnimalCanWalk = animal instanceof AnimalCanWalk ? numberOfAnimalCanWalk + 1 : numberOfAnimalCanWalk;
        }
        return numberOfAnimalCanWalk;
    }

    public int getNumberOfAnimalCanSing(List<Animal> animals) {
        if(animals == null || animals.isEmpty()) return 0;
        int numberOfAnimalCanSing = 0;
        for(Animal animal: animals) {
            numberOfAnimalCanSing = animal instanceof AnimalCanSing ? numberOfAnimalCanSing + 1 : numberOfAnimalCanSing;
        }
        return numberOfAnimalCanSing;
    }

    public int getNumberOfAnimalCanSwim(List<Animal> animals) {
        if(animals == null || animals.isEmpty()) return 0;
        int numberOfAnimalCanSwim = 0;
        for(Animal animal: animals) {
            numberOfAnimalCanSwim = animal instanceof AnimalCanSwim ? numberOfAnimalCanSwim + 1 : numberOfAnimalCanSwim;
        }
        return numberOfAnimalCanSwim;
    }
}
