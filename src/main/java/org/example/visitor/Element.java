package org.example.visitor;

public abstract class Element {
   public abstract void accept(Visitor v);
}
