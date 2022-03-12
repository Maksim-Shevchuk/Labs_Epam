package com.epam.lab.task1.packageModel;

public enum PackageType {
    SMALL_PACKAGE(0.1, 1),
    MEDIUM_PACKAGE(0.25, 1),
    LARGE_PACKAGE(1, 1),
    SMALL_JAR(0.5, 2),
    MEDIUM_JAR(1, 2),
    LARGE_JAR(2, 2);

    private double volume;
    private int priceCoefficient;



    PackageType(double volume, int priceCoefficient) {
        this.volume = volume;
        this.priceCoefficient = priceCoefficient;
    }

    public double getVolume() {
        return volume;
    }

    public int getPriceCoefficient() { return priceCoefficient; }
}
