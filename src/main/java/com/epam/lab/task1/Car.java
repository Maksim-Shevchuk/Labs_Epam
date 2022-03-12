package com.epam.lab.task1;

import com.epam.lab.task1.coffeeTypes.Coffee;
import com.epam.lab.task1.comparators.PriceComparator;
import com.epam.lab.task1.comparators.WeightComparator;
import com.epam.lab.task1.exceptions.VolumeOverflowException;
import java.util.List;
import java.util.stream.Collectors;

public class Car {

  private List<Coffee> coffeeList;
  private final double carVolume = 500.5;

  public Car(List<Coffee> coffeeList) throws VolumeOverflowException {
    if ((coffeeList.stream().mapToDouble(s -> s.getPackageType().getVolume()).sum() < carVolume)) {
      this.coffeeList = coffeeList;
    } else {
      throw new VolumeOverflowException();
    }
  }

  public List<Coffee> getCoffeeList() {
    return coffeeList;
  }

  public List<Coffee> sortByPrice() {
    return coffeeList.stream().sorted(new PriceComparator()).collect(Collectors.toList());
  }

  public List<Coffee> sortByWeight() {
    return coffeeList.stream().sorted(new WeightComparator()).collect(Collectors.toList());
  }

  public List<Coffee> findCoffeeByPrice(double minPrice, double maxPrice) {
    return coffeeList.stream().filter(c -> c.getPrice() >= minPrice)
        .filter(c -> c.getPrice() <= maxPrice).collect(Collectors.toList());
  }

  public List<? extends Coffee> findCoffeeByWeight(double minWeight, double maxWeight) {
    return coffeeList.stream().filter(c -> c.getWeight() >= minWeight)
        .filter(c -> c.getWeight() <= maxWeight).collect(Collectors.toList());
  }
}
