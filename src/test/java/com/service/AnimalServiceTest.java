package com.service;

import com.dao.AnimalDao;
import com.interfaces.Animal;
import com.model.Bird;
import com.model.Chicken;
import com.model.Fish;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
public class AnimalServiceTest {

    @InjectMocks
    AnimalService animalService;

    @Mock
    AnimalDao animalDao;

    private List<Animal> setUpAnimalListWithBird() {
        List<Animal> animals = new ArrayList<>();
        Animal bird = new Bird();
        bird.setName(Bird.class.getSimpleName());
        animals.add(bird);
        return animals;
    }

    @Test
    public void testGetAll() {
        List<Animal> animals = setUpAnimalListWithBird();
        when(animalDao.getAll()).thenReturn(animals);
        assertThat(animalService.getAll().size()).isEqualTo(1);

    }

    @Test
    public void testGetNumberOfAnimalCanFly() {
        List<Animal> animals = setUpAnimalListWithBird();

        Animal chicken = new Chicken();
        chicken.setName(Chicken.class.getSimpleName());
        animals.add(chicken);

        assertThat(animalService.getNumberOfAnimalCanFly(animals)).isEqualTo(1);
    }

    @Test public void testGetNumberOfAnimalCanWalk() {
        List<Animal> animals = new ArrayList<>();
        Animal chicken = new Chicken();
        chicken.setName(Chicken.class.getSimpleName());
        animals.add(chicken);
        assertThat(animalService.getNumberOfAnimalCanWalk(animals)).isEqualTo(1);
    }

    @Test public void testGetNumberOfAnimalCanSing() {
        List<Animal> animals = setUpAnimalListWithBird();
        assertThat(animalService.getNumberOfAnimalCanSing(animals)).isEqualTo(1);
    }

    @Test public void testGetNumberOfAnimalCanSwim() {
        List<Animal> animals = new ArrayList<>();
        Animal fish = new Fish();
        animals.add(fish);
        assertThat(animalService.getNumberOfAnimalCanSwim(animals)).isEqualTo(1);
    }
}
