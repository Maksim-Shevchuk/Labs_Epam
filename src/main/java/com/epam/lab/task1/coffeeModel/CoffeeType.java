package com.epam.lab.task1.coffeeModel;

public enum CoffeeType {
  ARABICA(2.0),
  ROBUSTA(0.9),
  LIBERICA(1.5);

  private double coefficient;

  CoffeeType(double coefficient) {
    this.coefficient = coefficient;
  }

  public double getCoffeeTypeCoefficient() {
    return coefficient;
  }
}
