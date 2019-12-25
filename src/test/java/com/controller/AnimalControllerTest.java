package com.controller;

import com.interfaces.Animal;
import com.model.Bird;
import com.model.Chicken;
import com.service.AnimalService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(AnimalController.class)
public class AnimalControllerTest {
    @MockBean
    AnimalService animalService;

    @Autowired
    private MockMvc mvc;

    @Test
    public void it_should_get_all_animals() throws Exception {
        List<Animal> animals = new ArrayList<>();
        Animal bird = new Bird();
        bird.setName(Bird.class.getSimpleName());
        animals.add(bird);

        Animal chicken = new Chicken();
        chicken.setName(Chicken.class.getSimpleName());
        animals.add(chicken);

        given(animalService.getAll()).willReturn(animals);

        mvc.perform(get("/animal/getAll")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(2)));

    }
}
