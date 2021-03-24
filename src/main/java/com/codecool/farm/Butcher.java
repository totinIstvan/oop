package com.codecool.farm;

import com.codecool.farm.animal.Animal;

class Butcher {

    boolean canButcher(Animal animal) {
        return animal.getSize() > 4;
    }

}
