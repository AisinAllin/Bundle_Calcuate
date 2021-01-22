package bundlecalculate;

import lombok.Data;

@Data
public class BundleImage extends Bundle {

    public BundleImage() {
        super();
        this.type = "IMG";
    }

    public BundleImage(int bundle_1, int bundle_2, double price, int bundle) {
        super(bundle_1, bundle_2, price, bundle);
    }

    @Override
    public void calculate() {
        int flag1;
        int flag2;

        for (flag1 = 0; flag1 * 5 <= need + 5; flag1++) {
            for (flag2 = 0; flag2 * 10 <= need + 10; flag2++) {

                if ((flag1 * 5 + flag2 * 10) >= need) {
                    double price = (flag1 * 450) + (flag2 * 800);

                    bundles.add(new BundleImage(flag1, flag2, price, flag1 + flag2));
                }
            }
        }
    }

    @Override
    public String toString() {
        return "bundlecalcu.Bundle{" +
                "bundle_1=" + bundle_1 +
                ", bundle_2=" + bundle_2 +
                ", price=" + price +
                ", bundle=" + bundle +
                '}';
    }
}