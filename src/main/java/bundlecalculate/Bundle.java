package bundlecalculate;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Bundle {

    public String type;
    public int need;
    public Map<Integer, Double> bundleCombo = new HashMap<>();
    public int bundleNum;
    public double min = Double.MAX_VALUE;

    public Bundle() {

    }
}