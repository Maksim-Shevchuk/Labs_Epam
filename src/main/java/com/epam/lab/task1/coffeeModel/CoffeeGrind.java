package com.epam.lab.task1.coffeeModel;

public enum CoffeeGrind {
  COARSE(0.8),
  MEDIUM_COARSE(0.9),
  MEDIUM(1),
  FINE(1.2),
  EXTRA_FINE(1.4);

  private double value;

  CoffeeGrind(double value) {
    this.value = value;
  }

  public double getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }
}
