package org.example.abstractfactory;

import java.net.http.HttpClient;

import static org.example.abstractfactory.TransportType.*;

public class Runner {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new AbstractFactory();

        Factory factory = abstractFactory.createFactory(AIR);

        Transport instance = factory.createInstance(1);
        int maxSpeed = instance.getMaxSpeed();
        System.out.println(maxSpeed);

    }
}
