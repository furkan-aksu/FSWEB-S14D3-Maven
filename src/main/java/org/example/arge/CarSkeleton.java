package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void startEngine() {
        System.out.println("The engine is starting.");
    }

    public void drive() {
        runEngine();
        System.out.println("The car is driving.");
    }

    protected void runEngine() {
        System.out.println("The engine is running.");
    }
}
