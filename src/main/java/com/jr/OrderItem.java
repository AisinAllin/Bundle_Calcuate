package com.jr;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
public class OrderItem {
    private String targetType;
    private int targetNumber;
}
