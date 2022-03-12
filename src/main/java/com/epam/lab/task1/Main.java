package com.epam.lab.task1;

import com.epam.lab.task1.coffeeModel.CoffeeGrind;
import com.epam.lab.task1.coffeeModel.CoffeeType;
import com.epam.lab.task1.coffeeTypes.*;
import com.epam.lab.task1.packageModel.PackageType;
import com.epam.lab.task1.coffeeModel.RoastDegree;
import com.epam.lab.task1.exceptions.VolumeOverflowException;

import java.util.Arrays;
import java.util.List;

public class Main {
    private static List<Coffee> allCoffee = Arrays.asList(
            new CoffeeBeans(CoffeeType.LIBERICA, PackageType.SMALL_PACKAGE, 0.75, RoastDegree.MEDIUM),
            new GroundCoffee(CoffeeType.ARABICA, PackageType.LARGE_PACKAGE, 1.8, RoastDegree.MEDIUM_DARK, CoffeeGrind.COARSE),
            new InstantCoffee(CoffeeType.ROBUSTA, PackageType.LARGE_JAR, 2.1, false),
            new CoffeeBeans(CoffeeType.ARABICA, PackageType.SMALL_JAR, 0.4, RoastDegree.MEDIUM_DARK),
            new GroundCoffee(CoffeeType.ARABICA, PackageType.SMALL_JAR, 0.4, RoastDegree.MEDIUM_DARK, CoffeeGrind.MEDIUM_COARSE)
        );

    public static void main(String[] args){
        try {
            Car car = new Car(allCoffee);
            System.out.println("sort by weight " + car.sortByWeight()
                                + "\n sort by price " + car.sortByPrice()
                                + "\n find coffee by price " + car.findCoffeeByPrice(0.1, 5));
        } catch (VolumeOverflowException e){
            e.printStackTrace();
        }
    }
}
