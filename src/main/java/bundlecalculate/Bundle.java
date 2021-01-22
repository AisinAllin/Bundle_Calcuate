package bundlecalculate;

import lombok.Data;

import java.util.*;
import java.util.stream.Collectors;

@Data
public abstract class Bundle {
    public int bundle_1;
    public int bundle_2;
    public double price;
    public int bundle;
    public String type;
    public int need;
    public List<Bundle> bundles = new ArrayList<>();

    public Bundle(int bundle_1, int bundle_2, double price, int bundle) {
        this.bundle_1 = bundle_1;
        this.bundle_2 = bundle_2;
        this.price = price;
        this.bundle = bundle;
    }

    public Bundle() {
    }

    public void input(Bundle bundle) {
        Scanner input = new Scanner(System.in);

        System.out.print("please input the number of  " + bundle.getType() + " : ");
        bundle.need = input.nextInt();
    }

    public void output(Bundle bundle) {
        Optional<Bundle> price = bundle.bundles.stream().min(Comparator.comparingDouble(Bundle::getPrice));
//        List<Double> min = price.stream().map(Bundle::getPrice).collect(Collectors.toList());

        System.out.println("———————————————————————————————————————-———————————————————————————");
        System.out.println(bundle.getType() + " 的最低价格：" + price.stream().map(Bundle::getPrice).collect(Collectors.toList()));
        System.out.println("———————————————————————————————————————-———————————————————————————");

        System.out.println(bundle.getType() + " ———— 按照价格排序");
        bundle.bundles.stream().sorted(Comparator.comparing(Bundle::getPrice)).forEach(System.out::println);
        System.out.println("———————————————————————————————————————-———————————————————————————");

        System.out.println(bundle.getType() + " ———— 按照bundle排序");
        bundle.bundles.stream().sorted(Comparator.comparing(Bundle::getBundle)).forEach(System.out::println);
        System.out.println("———————————————————————————————————————————————————————————————————");
    }

    public void calculate() {
    }

}