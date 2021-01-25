package com.jr;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class FilledOrderItem {
    private double minPrice;
}
