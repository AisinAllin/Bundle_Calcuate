package com.jr;

public class OrderInput {
    public Order input(MediaBundle mediaBundle, int target) {

        Order order = new Order();
        order.orderList.add(OrderItem.builder().targetType(mediaBundle.getMediaBundleList().get(0).getType()).targetNumber(target).build());
        return order;
    }
}
