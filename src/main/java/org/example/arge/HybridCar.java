package org.example.arge;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(double avgKmPerLitre, int batterySize, int cylinders) {
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Hybrid engine is starting.");
    }

    @Override
    public void drive() {
        runEngine();
        System.out.println("Hybrid car is driving.");
    }
}