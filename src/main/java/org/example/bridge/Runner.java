package org.example.bridge;

public class Runner {
    public static void main(String[] args) {
        Car car = new Hatchback(new Kia());
        car.showDetails();
    }
}
