package org.example.visitor;

public class Runner {

        public static void main(String[] args) {

            Visitor v = new ElementVisitor();

            Document d = new Document();
            d.elements.add(new JsonElement());
            d.elements.add(new JsonElement());
            d.elements.add(new XMLElement());

            d.accept(v);
        }

}
