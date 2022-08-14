package org.example.strategy;

public class Worker {
    public void doAction(Action action) {
        System.out.println(action.print());
    }
}
