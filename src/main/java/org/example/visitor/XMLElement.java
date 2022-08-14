package org.example.visitor;

import lombok.Getter;

import java.util.UUID;

@Getter
public class XMLElement extends Element{

    // ...
    private final UUID uuid = UUID.randomUUID();

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
