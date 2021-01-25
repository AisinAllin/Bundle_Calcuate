package com.jr;

public class OrderInput {
    public static void input(int target) {

        MediaBundle mediaBundle = new MediaBundle();
        mediaBundle.mediaBundleList.add(SubmissionBundle.builder().bundleNum(5).bundlePrice(450.0).build());
        mediaBundle.mediaBundleList.add(SubmissionBundle.builder().bundleNum(10).bundlePrice(800.0).build());

        new BundleCalculator().calculate(mediaBundle.mediaBundleList, target);

    }
}
