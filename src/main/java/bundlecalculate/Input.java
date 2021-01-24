package bundlecalculate;

import java.util.Scanner;

public class Input {
    public void input(Bundle bundle) {
        Scanner input = new Scanner(System.in);

        System.out.print("please input the type: ");
        bundle.setType(input.nextLine());

        System.out.print(bundle.type + " type required quantity: ");
        bundle.setNeed(input.nextInt());

        System.out.print("Number of combinations of " + bundle.type + " types: ");
        bundle.setBundleNum(input.nextInt());
        System.out.println();

        for (int i = 0; i < bundle.bundleNum; i++) {
            int num;
            double price;
            System.out.print("please input No." + (i + 1) + " bundle's number: ");
            num = input.nextInt();
            System.out.print("please input No." + (i + 1) + " bundle's price: ");
            price = input.nextDouble();
            System.out.println();
            bundle.bundleCombo.put(num, price);
        }

        //test
//
//        bundle.setType("img");
//        bundle.setNeed(21);
//        bundle.setBundleNum(2);
//
//        bundle.bundleCombo.put(5, 450.0);
//        bundle.bundleCombo.put(10, 800.0);

        new Calculator().calculator(bundle);

    }
}
