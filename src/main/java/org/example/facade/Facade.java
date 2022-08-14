package org.example.facade;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class Facade {
    FirstService firstService;
    SecondService secondService;

    public void event(){
        firstService.activate();
        secondService.print();
    }
}
