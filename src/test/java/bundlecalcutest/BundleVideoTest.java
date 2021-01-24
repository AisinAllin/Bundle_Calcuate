//package bundlecalcutest;
//
//import bundlecalculate.Bundle;
//import bundlecalculate.BundleVideo;
//import org.junit.Test;
//
//import java.util.Comparator;
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//
//import static org.junit.Assert.assertEquals;
//
//
//class BundleVideoTest {
//
//    @Test
//    void calculate() {
//        Bundle vid = new BundleVideo();
//        vid.setNeed(13);
//        vid.calculate();
//        Optional<Bundle> price = vid.bundles.stream().min(Comparator.comparingDouble(Bundle::getPrice));
//        List<Double> min = price.stream().map(Bundle::getPrice).collect(Collectors.toList());
//        double minPrice = min.get(0);
//        assertEquals(2370.0, minPrice);
//    }
//}