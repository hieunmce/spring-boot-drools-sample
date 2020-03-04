package com.sample.demo;

import java.util.List;
import java.util.Map;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Product {
    private String type;
    private int discount;
    private Map<String, String> regions;
    private List<String> manufacturers;
}