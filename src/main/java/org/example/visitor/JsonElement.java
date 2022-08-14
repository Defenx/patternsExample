package org.example.visitor;

import lombok.Getter;

import java.util.UUID;

@Getter
public class JsonElement extends Element {

    private final UUID uuid = UUID.randomUUID();

    public void accept(Visitor v) {
        v.visit(this);
    }
}
