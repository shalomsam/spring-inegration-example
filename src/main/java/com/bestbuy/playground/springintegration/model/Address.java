package com.bestbuy.playground.springintegration.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Address {
    private String street;
    private String city;
    private String state;
}
