package com.jr;

public class App {
    public static void main(String[] args) {

        //set img bundle
        MediaBundle imgBundle = new MediaBundle();
        imgBundle.mediaBundleList.add(SubmissionBundle.builder().type("img").bundleNum(5).bundlePrice(450.0).build());
        imgBundle.mediaBundleList.add(SubmissionBundle.builder().type("img").bundleNum(10).bundlePrice(800.0).build());

        //set flac bundle
        MediaBundle flacBundle = new MediaBundle();
        flacBundle.mediaBundleList.add(SubmissionBundle.builder().type("flac").bundleNum(3).bundlePrice(427.5).build());
        flacBundle.mediaBundleList.add(SubmissionBundle.builder().type("flac").bundleNum(6).bundlePrice(810.0).build());
        flacBundle.mediaBundleList.add(SubmissionBundle.builder().type("flac").bundleNum(9).bundlePrice(1147.5).build());

        //set vid bundle
        MediaBundle vidBundle = new MediaBundle();
        vidBundle.mediaBundleList.add(SubmissionBundle.builder().type("vid").bundleNum(3).bundlePrice(570.0).build());
        vidBundle.mediaBundleList.add(SubmissionBundle.builder().type("vid").bundleNum(5).bundlePrice(900.0).build());
        vidBundle.mediaBundleList.add(SubmissionBundle.builder().type("vid").bundleNum(9).bundlePrice(1530.0).build());

        //input requirement
        Order imgOrder = new OrderInput().input(imgBundle, 10);
        Order flacOrder = new OrderInput().input(flacBundle, 15);
        Order vidOrder = new OrderInput().input(vidBundle, 17);

        //calculate - img
        BundleCalculator imgBundleCalculator = new BundleCalculator();
        FilledOrder imgFilledOrder = imgBundleCalculator.calculate(imgBundle.mediaBundleList, imgOrder.orderList);

        //calculate - flac
        BundleCalculator flacBundleCalculator = new BundleCalculator();
        FilledOrder flacFilledOrder = flacBundleCalculator.calculate(flacBundle.mediaBundleList, flacOrder.orderList);

        //calculate - vid
        BundleCalculator vidBundleCalculator = new BundleCalculator();
        FilledOrder vidFilledOrder = vidBundleCalculator.calculate(vidBundle.mediaBundleList, vidOrder.orderList);

        //output -img
        OrderOutput imgOutput = new OrderOutput();
        imgOutput.output(imgOrder.orderList, imgFilledOrder.filedOrderList, imgBundle.mediaBundleList);

        //output -img
        OrderOutput flacOutput = new OrderOutput();
        flacOutput.output(flacOrder.orderList, flacFilledOrder.filedOrderList, flacBundle.mediaBundleList);

        //output -img
        OrderOutput vidOutput = new OrderOutput();
        vidOutput.output(vidOrder.orderList, vidFilledOrder.filedOrderList, vidBundle.mediaBundleList);
    }
}