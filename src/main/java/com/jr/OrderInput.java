package com.jr;

public class OrderInput {
    public static void input(String type, int target) {

        MediaBundle mediaBundle = new MediaBundle();

        switch (type) {
            case "img" -> {
                mediaBundle.mediaBundleList.add(SubmissionBundle.builder().bundleNum(5).bundlePrice(450.0).build());
                mediaBundle.mediaBundleList.add(SubmissionBundle.builder().bundleNum(10).bundlePrice(800.0).build());
            }
            case "flac" -> {
                mediaBundle.mediaBundleList.add(SubmissionBundle.builder().bundleNum(3).bundlePrice(427.5).build());
                mediaBundle.mediaBundleList.add(SubmissionBundle.builder().bundleNum(6).bundlePrice(810.0).build());
                mediaBundle.mediaBundleList.add(SubmissionBundle.builder().bundleNum(9).bundlePrice(1147.5).build());
            }
            case "vid" -> {
                mediaBundle.mediaBundleList.add(SubmissionBundle.builder().bundleNum(3).bundlePrice(570.0).build());
                mediaBundle.mediaBundleList.add(SubmissionBundle.builder().bundleNum(5).bundlePrice(900.0).build());
                mediaBundle.mediaBundleList.add(SubmissionBundle.builder().bundleNum(9).bundlePrice(1530.0).build());
            }
        }

        Order order = new Order();
        order.orderList.add(OrderItem.builder().targetType(type).targetNumber(target).build());

        new BundleCalculator().calculate(mediaBundle.mediaBundleList, order.orderList);
    }
}
