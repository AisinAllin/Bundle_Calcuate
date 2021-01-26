package com.jr;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.HashMap;
import java.util.Map;

@Data
@SuperBuilder
public class FilledOrderItem {
    private double minPrice;
    private String requireType;
    private int[] bundleSelected;
}
