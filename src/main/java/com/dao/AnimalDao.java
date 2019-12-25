package com.dao;

import com.interfaces.Animal;
import com.model.ExampleModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AnimalDao {

    public List<Animal> getAll() {
        return ExampleModel.getAllAnimals();


    }
}
