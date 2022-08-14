package org.example.abstractfactory;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.example.abstractfactory.bean.Ship;

import java.util.Map;
import java.util.PrimitiveIterator;
import java.util.function.Supplier;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class WaterFactory implements Factory {

    Map<Integer, Supplier<Transport>> map = Map.ofEntries(
            Map.entry(1, Ship::new)
    );

    @Override
    public Transport createInstance(int id) {
        Supplier<Transport> transportSupplier = map.get(id);
        return transportSupplier.get();
    }
}
