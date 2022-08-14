package org.example.facade;

public class Runner {
    public static void main(String[] args) {
        FirstService firstService = new FirstService();
        SecondService secondService = new SecondService();
        Facade facade = new Facade(firstService, secondService);

        facade.event();
    }
}
