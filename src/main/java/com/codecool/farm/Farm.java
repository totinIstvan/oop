package com.codecool.farm;

import com.codecool.farm.animal.Animal;

import java.util.ArrayList;
import java.util.List;

class Farm {

    List<Animal> animals;

    public Farm(List<Animal> animals) {
        this.animals = animals;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void feedAnimals() {
        for (Animal animal : animals) {
            animal.feed();
        }
    }

    public void butcher(Butcher butcher) {
        animals.removeIf(butcher::canButcher);
    }

    public boolean isEmpty() {
        return animals.isEmpty();
    }

    public List<String> getStatus() {
        String format = "There is a %d sized %s in the farm.";
        List<String> statusesOfAnimals = new ArrayList<>();

        for (Animal animal : animals) {
            statusesOfAnimals.add(String.format(format, animal.getSize(), animal.getClass()
                    .getSimpleName().toLowerCase()));
        }
        return statusesOfAnimals;
    }
}
