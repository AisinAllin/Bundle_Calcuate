package bundlecalculate;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Input {
    public int need;
    public String type;
    public int bundleNum;
    public Map<Integer, Double> bundle = new HashMap<>();

    public void input() {
        Scanner input = new Scanner(System.in);

        System.out.print("please input the type: ");
        type = input.nextLine();

        System.out.print(type + " type required quantity: ");
        need = input.nextInt();

        System.out.print("Number of combinations of " + type + " types: ");
        bundleNum = input.nextInt();

        for (int i = 0; i < bundleNum; i++) {
            int num;
            double price;
            System.out.print("please input No." + (i + 1) + " bundle's number: ");
            num = input.nextInt();
            System.out.print("please input No." + (i + 1) + " bundle's price: ");
            price = input.nextDouble();
            System.out.println();
            bundle.put(num, price);
        }

        System.out.println("————————————————————————————————————————————————————");
        System.out.println("Quantity of requirement: " + need + "\nType of requirement: " + type + "\nNumber of bundles: " + bundleNum + "\n");

        for (Map.Entry<Integer, Double> entry : bundle.entrySet()) {
            System.out.println("Number of bundles:" + entry.getKey() + "\tprice of bundles: " + entry.getValue() + "\n");
        }
        System.out.println("————————————————————————————————————————————————————");
    }
}
