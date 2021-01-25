package com.jr;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class BundleCalculator {
    public void calculate(List<SubmissionBundle> mediaBundleList, int target) {

        double[] dp = new double[target + 1];

        Arrays.fill(dp, Double.MAX_VALUE);
        dp[0] = 0;

        IntStream.range(1, target + 1).forEach(i -> {
            IntStream.range(0, mediaBundleList.size()).forEach(j -> {
                if (i >= mediaBundleList.get(j).getBundleNum() && dp[i - mediaBundleList.get(j).getBundleNum()] != Double.MAX_VALUE) {
                    dp[i] = Math.min(dp[i - mediaBundleList.get(j).getBundleNum()] + mediaBundleList.get(j).getBundlePrice(), dp[i]);
                }
            });
        });

        FilledOrder filledOrder = new FilledOrder();
        filledOrder.filedOrderList.add(FilledOrderItem.builder().minPrice(dp[target]).build());

        new OrderOutput().output(filledOrder.filedOrderList);
    }
}
