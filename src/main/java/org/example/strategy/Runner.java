package org.example.strategy;

public class Runner {
    public static void main(String[] args) {
        Worker worker = new Worker();

        worker.doAction(new SecondAction());
        worker.doAction(new FirstAction());
    }
}
