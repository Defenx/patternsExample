package org.example.bridge;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
public abstract class Car {

    private final Make make;

    public Car(Make make) {
        this.make = make;
    }

    protected abstract void showDetails();

}
