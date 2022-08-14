package org.example.bridge;

public class Hatchback extends Car{

    public Hatchback(Make make) {
        super(make);
    }

    @Override
    public void showDetails() {
        System.out.println("Hatchback");
        getMake().setMake();
    }
}
