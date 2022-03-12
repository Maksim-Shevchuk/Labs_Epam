package com.epam.lab.task1.coffeeModel;

public enum RoastDegree {
  WHITE(1),
  LIGHT(1.1),
  MEDIUM(1.2),
  MEDIUM_DARK(1.3),
  DARK(1.4);
  private double coefficient;

  RoastDegree(double coefficient) {
    this.coefficient = coefficient;
  }

  public double getCoefficient() {
    return coefficient;
  }
}
