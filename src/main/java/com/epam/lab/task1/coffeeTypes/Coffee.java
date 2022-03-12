package com.epam.lab.task1.coffeeTypes;

import com.epam.lab.task1.coffeeModel.CoffeeType;
import com.epam.lab.task1.packageModel.PackageType;

public abstract class Coffee {

  private CoffeeType coffeeType;
  private PackageType packageType;
  private double weight;

  public abstract double getPrice();

  public Coffee(CoffeeType coffeeType, PackageType packageType, double weight) {
    this.coffeeType = coffeeType;
    this.packageType = packageType;
    this.weight = weight;
  }

  public CoffeeType getCoffeeType() {
    return coffeeType;
  }

  public PackageType getPackageType() {
    return packageType;
  }

  public double getWeight() {
    return weight;
  }

  @Override
  public String toString() {
    return "Coffee{" +
        "coffeeType=" + coffeeType +
        ", packageType=" + packageType +
        ", weight=" + weight +
        '}';
  }

  public void setCoffeeType(CoffeeType coffeeType) {
    this.coffeeType = coffeeType;
  }

  public void setPackageType(PackageType packageType) {
    this.packageType = packageType;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }
}
