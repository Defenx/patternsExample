package org.example.command;

public class Stock {

    private final String name = "qwerty";
    private final int quantity = 50;

    public void buy(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
    }
    public void sell(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
    }
}
