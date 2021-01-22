package bundlecalcutest;

import bundlecalculate.Bundle;
import bundlecalculate.BundleImage;
import org.junit.Test;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;


class BundleImageTest {

    @Test
    void calculate() {
        Bundle img = new BundleImage();
        img.setNeed(10);
        img.calculate();
        Optional<Bundle> price = img.bundles.stream().min(Comparator.comparingDouble(Bundle::getPrice));
        List<Double> min = price.stream().map(Bundle::getPrice).collect(Collectors.toList());
        double minPrice = min.get(0);
        assertEquals(800.0, minPrice);
    }
}