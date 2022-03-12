package com.epam.lab.task1.coffeeTypes;

import com.epam.lab.task1.coffeeModel.CoffeeGrind;
import com.epam.lab.task1.coffeeModel.CoffeeType;
import com.epam.lab.task1.coffeeModel.RoastDegree;
import com.epam.lab.task1.packageModel.PackageType;

public class GroundCoffee extends CoffeeBeans {

  private CoffeeGrind coffeeGrind;
  private static final double PRICE_COEFFICIENT = 1.9;

  public GroundCoffee(CoffeeType coffeeType, PackageType packageType, double weight,
      RoastDegree roastDegree, CoffeeGrind coffeeGrind) {
    super(coffeeType, packageType, weight, roastDegree);
    this.coffeeGrind = coffeeGrind;
  }

  @Override
  public String toString() {
    return super.toString().replace("}", ", GroundCoffee{" +
        "CoffeeGrind" + coffeeGrind +
        '}');
  }

  @Override
  public double getPrice() {
    return PRICE_COEFFICIENT * getCoffeeType().getCoffeeTypeCoefficient()
        * getPackageType().getPriceCoefficient()
        * coffeeGrind.getValue() * roastDegree.getCoefficient();
  }
}
