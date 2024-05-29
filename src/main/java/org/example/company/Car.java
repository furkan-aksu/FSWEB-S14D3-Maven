package org.example.company;


import java.util.Objects;

public class Car {
    private boolean engine;

    private int cylinders;

    private String name;

    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", cylinders=" + cylinders +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Car car = (Car) object;

        return cylinders ==car.cylinders && Objects.equals(name,car.name);

    }

    @Override
    public int hashCode() {

        return Objects.hash(name,cylinders);
    }

    public String startEngine() {
        return getClass().getSimpleName() + ": The car's engine is starting.";
    }

    public String accelerate() {
        return getClass().getSimpleName() + ": The car is accelerating.";
    }

    public String brake() {
        return getClass().getSimpleName() + ": The car is braking.";
    }
}