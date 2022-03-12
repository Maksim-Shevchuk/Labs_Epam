package com.epam.lab.task1.coffeeTypes;

import com.epam.lab.task1.coffeeModel.CoffeeType;
import com.epam.lab.task1.packageModel.PackageType;

public class InstantCoffee extends Coffee {
    private boolean caffeineFree;
    private static final double PRICE_COEFFICIENT = 1.7;

    public InstantCoffee(CoffeeType coffeeType, PackageType packageType, double weight, boolean caffeineFree) {
        super(coffeeType, packageType, weight);
        this.caffeineFree = caffeineFree;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", ", InstantCoffee{" +
            "caffeineFree=" + caffeineFree +
            '}');
    }

    @Override
    public double getPrice() {
        double price = PRICE_COEFFICIENT * getCoffeeType().getCoffeeTypeCoefficient() * getPackageType().getPriceCoefficient();
        if (caffeineFree) {
            price *= 2;
        }
        return price;
    }
}
