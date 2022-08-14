package org.example.visitor;

public interface Visitor {
    void visit(JsonElement jsonElement);
    void visit(XMLElement xmlElement);
}
