package com.jr;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class SubmissionBundle {
    private int bundleNum;
    private Double bundlePrice;
}
