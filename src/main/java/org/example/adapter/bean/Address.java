package org.example.adapter.bean;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Address {
    String street;
    String suite;
    String city;
    String zipcode;
    Geo geo;
}
