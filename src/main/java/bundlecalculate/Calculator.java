package bundlecalculate;

import java.util.Arrays;
import java.util.Iterator;

public class Calculator {

    public void calculator(Bundle bundle) {
        int[] bun = new int[bundle.bundleNum];
        Double[] bunPrice = new Double[bundle.bundleNum];
        Double[] dp = new Double[bundle.need];

        Iterator<Integer> iter = bundle.bundleCombo.keySet().iterator();
        int flag = 0;

        while (iter.hasNext()) {
            int key = iter.next();
            Double value = bundle.bundleCombo.get(key);

            bun[flag] = key;
            bunPrice[flag] = value;
            flag++;
        }

        Arrays.fill(dp, Double.MAX_VALUE);

        if (bundle.need >= bun[0]) {
            for (int i = 0; i <= bun[0]; i++) {
                dp[i] = bunPrice[0];
            }
        } else {
            for (int i = 0; i < bundle.need; i++) {
                dp[i] = bunPrice[0];
            }
        }

        for (int j = 0; j < bun.length; j++) {
            for (int i = bundle.need - 1; i >= 0; i--) {
                if (i - bun[j] >= 0) {
                    dp[i] = Math.min(dp[i - bun[j]] + bunPrice[j], dp[i]);
                } else {
                    dp[i] = dp[i] + bun[0];
                }
            }
        }

//        for (int i = 0; i < dp.length; i++){
//            bundle.min = bundle.min < dp[i] ? bundle.min : dp[i];
//        }
//        System.out.println(bundle.min+"\n");
//
//        for (int i = 0; i < dp.length; i++) {
//            System.out.println(dp[i]+ " ");
//        }

        new Output().output(bundle);
    }

}
