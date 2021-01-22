package bundlecalculate;

import lombok.Data;

@Data
public class BundleVideo extends Bundle {

    private int bundle_3;

    public BundleVideo() {
        super();
        this.type = "VID";
    }

    public BundleVideo(int bundle_1, int bundle_2, int bundle_3, double price, int bundle) {
        super(bundle_1, bundle_2, price, bundle);
        this.bundle_3 = bundle_3;
    }

    @Override
    public String toString() {
        return "bundlecalcu.Bundle{" +
                "bundle_1=" + bundle_1 +
                ", bundle_2=" + bundle_2 +
                ", bundle_3=" + bundle_3 +
                ", price=" + price +
                ", bundle=" + bundle +
                '}';
    }

    public void calculate() {
        int flag1;
        int flag2;
        int flag3;

        for (flag1 = 0; flag1 * 3 <= need + 3; flag1++) {
            for (flag2 = 0; flag2 * 5 <= need + 5; flag2++) {
                for (flag3 = 0; flag3 * 9 <= need + 9; flag3++) {

                    if ((flag1 * 3 + flag2 * 5 + flag3 * 9) >= need) {
                        double price = (flag1 * 570) + (flag2 * 900) + (flag3 * 1530);

                        bundles.add(new BundleVideo(flag1, flag2, flag3, price, (flag1 + flag2 + flag3)));
                    }
                }
            }
        }
    }
}