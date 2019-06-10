package com.zipcodewilmington.assessment2.part2.router;

import com.zipcodewilmington.assessment2.part3.Animal;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        int result = 0;
        if (o1.getSpeed() > o2.getSpeed()) {
            result = -1;
        } else if (o1.getSpeed() < o2.getSpeed()) {
            result = 1;
        } else if (o1.getSpeed() == o2.getSpeed()) {
            result = 0;
        }
        return result;
    }
}
