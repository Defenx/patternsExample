package org.example.adapter.bean;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    Long id;
    String name;
    String username;
    String email;
    Address address;
    String phone;
    String website;
    Company company;
}
