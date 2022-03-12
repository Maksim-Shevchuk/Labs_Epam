package com.epam.lab.task1.comparators;

import com.epam.lab.task1.coffeeTypes.Coffee;

import java.util.Comparator;

public class WeightComparator implements Comparator<Coffee> {
    @Override
    public int compare(Coffee o1, Coffee o2) {
        return Double.compare(o1.getWeight(), o2.getWeight());
    }
}
