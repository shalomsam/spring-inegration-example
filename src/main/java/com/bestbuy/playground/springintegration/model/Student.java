package com.bestbuy.playground.springintegration.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
public class Student implements Serializable {
    private String id;
    private String name;
    private int age;
}
