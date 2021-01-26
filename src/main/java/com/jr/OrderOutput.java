package com.jr;

import java.util.List;

public class OrderOutput {
    public void output(List<OrderItem> target, List<FilledOrderItem> filledOrders, List<SubmissionBundle> mediaBundleList) {

        System.out.println(target.get(0).getTargetNumber() + " " + target.get(0).getTargetType() + " $" + filledOrders.get(0).getMinPrice());

        int[] arry = filledOrders.get(0).getBundleSelected();

        for (int i = 0; i < filledOrders.get(0).getBundleSelected().length; i++) {
            if (arry[i] != 0) {
                System.out.println("  " + arry[i] + " x " + mediaBundleList.get(i).getBundleNum() + " $" + mediaBundleList.get(i).getBundlePrice());
            }
        }
    }
}

