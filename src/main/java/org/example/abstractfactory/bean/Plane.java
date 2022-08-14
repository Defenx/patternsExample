package org.example.abstractfactory.bean;

import org.example.abstractfactory.Transport;

public class Plane implements Transport {
    @Override
    public int getMaxSpeed() {
        return 500;
    }
}
