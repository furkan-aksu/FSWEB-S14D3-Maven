package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(double avgKmPerLitre, int cylinders) {
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Gas-powered engine is starting.");
    }

    @Override
    public void drive() {
        runEngine();
        System.out.println("Gas-powered car is driving.");
    }
}