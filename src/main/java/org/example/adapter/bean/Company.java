package org.example.adapter.bean;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Company {
    String name;
    String catchPhrase;
    String bs;
}
