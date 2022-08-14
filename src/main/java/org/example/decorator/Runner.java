package org.example.decorator;

public class Runner {

    public static void main(String[] args) {

        INotifier notifyAll = new FacebookDecorator(new WhatsAppDecorator(new Notifier("Valera")));
        notifyAll.send("hello");

        System.out.println("======================================================");

        INotifier notifyFbMail = new FacebookDecorator(new Notifier("Valera"));
        notifyFbMail.send("hello");

    }

}