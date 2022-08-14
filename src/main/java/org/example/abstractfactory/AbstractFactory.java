package org.example.abstractfactory;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.Map;
import java.util.function.Supplier;

import static org.example.abstractfactory.TransportType.AIR;
import static org.example.abstractfactory.TransportType.WATER;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AbstractFactory {

    Map<TransportType, Supplier<Factory>> factory = Map.ofEntries(
            Map.entry(AIR, AirFactory::new),
            Map.entry(WATER, WaterFactory::new)
    );

    public Factory createFactory(TransportType type) {
        Supplier<Factory> factorySupplier = factory.get(type);
        return factorySupplier.get();
    }
}
