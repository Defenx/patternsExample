package org.example.abstractfactory;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.example.abstractfactory.bean.Plane;

import java.util.Map;
import java.util.function.Supplier;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AirFactory implements Factory{

    Map<Integer, Supplier<Transport>> map = Map.ofEntries(
            Map.entry(1, Plane::new)
    );

    @Override
    public Transport createInstance(int id) {
        Supplier<Transport> transportSupplier = map.get(id);
        return transportSupplier.get();
    }
}
