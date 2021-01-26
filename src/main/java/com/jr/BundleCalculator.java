package com.jr;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class BundleCalculator {
    public void calculate(List<SubmissionBundle> mediaBundleList, List<OrderItem> target) {

        int stats = target.get(0).getTargetNumber();
        FilledOrder filledOrder = new FilledOrder();
        Map<Integer, Integer> map = new HashMap<>();

        double[] dp = new double[stats + 1];

        Arrays.fill(dp, Double.MAX_VALUE);
        dp[0] = 0;

        IntStream.range(1, stats + 1).forEach(i -> IntStream.range(0, mediaBundleList.size()).forEach(j -> {
            if (i >= mediaBundleList.get(j).getBundleNum() && dp[i - mediaBundleList.get(j).getBundleNum()] != Double.MAX_VALUE) {
                if (dp[i - mediaBundleList.get(j).getBundleNum()] + mediaBundleList.get(j).getBundlePrice() < dp[i]) {
                    dp[i] = dp[i - mediaBundleList.get(j).getBundleNum()] + mediaBundleList.get(j).getBundlePrice();
                }
            }
        }));

        Double[][] bundleSelected = new Double[mediaBundleList.size() + 1][target.get(0).getTargetNumber() + 1];

        for (int i = 0; i < mediaBundleList.size() + 1; i++) {
            bundleSelected[i][0] = 0.0;
        }
        for (int j = 0; j < target.get(0).getTargetNumber() + 1; j++) {
            bundleSelected[0][j] = 0.0;
        }

        for (int i = 1; i < mediaBundleList.size() + 1; i++) {
            for (int j = 1; j < target.get(0).getTargetNumber() + 1; j++) {
                if (mediaBundleList.get(i - 1).getBundleNum() <= j) {
                    if (bundleSelected[i - 1][j] < (bundleSelected[i - 1][j - mediaBundleList.get(i - 1).getBundleNum()] + mediaBundleList.get(i - 1).getBundlePrice())) {
                        bundleSelected[i][j] = bundleSelected[i - 1][j - mediaBundleList.get(i - 1).getBundleNum()] + mediaBundleList.get(i - 1).getBundlePrice();
                    } else {
                        bundleSelected[i][j] = bundleSelected[i - 1][j];
                    }
                } else {
                    bundleSelected[i][j] = bundleSelected[i - 1][j];
                }
            }
        }

        int[] x = new int[mediaBundleList.size()];
        int a = target.get(0).getTargetNumber();

        for (int i = mediaBundleList.size(); i > 0; i--) {

            if (bundleSelected[i][a] > bundleSelected[i - 1][a]) {
                x[i - 1] = 1;
                a -= mediaBundleList.get(i - 1).getBundleNum();
            }
        }

        filledOrder.filedOrderList.add(FilledOrderItem.builder().minPrice(dp[stats]).requireType(target.get(0).getTargetType()).bundleSelected(x).build());

        new OrderOutput().output(target,filledOrder.filedOrderList, mediaBundleList);
    }
}
