package org.example.abstractfactory.bean;

import org.example.abstractfactory.Transport;

public class Ship implements Transport {
    @Override
    public int getMaxSpeed() {
        return 100;
    }
}
