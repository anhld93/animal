package com.controller;

import com.interfaces.Animal;
import com.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping(path = "/animal")
public class AnimalController {
    @Autowired
    AnimalService animalService;

    @GetMapping(path = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Animal>> getAllAnimals() {
        List<Animal> animals = animalService.getAll();

        return new ResponseEntity<>(animals, HttpStatus.OK);


    }
}


//    @GetMapping(path = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<List<Animal>> getAllAnimals() {
//        List<Animal> animals = animalService.getAll();
//        return new ResponseEntity<>(animals, HttpStatus.OK);
//    }