package com.epam.lab.task1.coffeeTypes;

import com.epam.lab.task1.coffeeModel.CoffeeType;
import com.epam.lab.task1.coffeeModel.RoastDegree;
import com.epam.lab.task1.packageModel.PackageType;

public class CoffeeBeans extends Coffee {

  protected RoastDegree roastDegree;
  private static final double PRICE_COEFFICIENT = 2.3;

  public CoffeeBeans(CoffeeType coffeeType, PackageType packageType, double weight,
      RoastDegree roastDegree) {
    super(coffeeType, packageType, weight);
    this.roastDegree = roastDegree;
  }

  @Override
  public String toString() {
    return super.toString().replace("}", ", CoffeeBeans{" +
        "roastDegree=" + roastDegree +
        '}');
  }

  @Override
  public double getPrice() {
    return PRICE_COEFFICIENT * getCoffeeType().getCoffeeTypeCoefficient()
        * getPackageType().getPriceCoefficient()
        * roastDegree.getCoefficient();
  }
}

