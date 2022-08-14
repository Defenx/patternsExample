package org.example.bridge;

public class Sedan extends Car{

    public Sedan(Make make) {
        super(make);
    }

    @Override
    public void showDetails() {
        System.out.println("Sedan");
        getMake().setMake();
    }
}
