package bundlecalculate;

public class Output {
    public void output(Bundle bundle) {
        System.out.println("———————————————————————————————————————-———————————————————————————");
        System.out.println(" The lowest price of " + bundle.getType() + " is " + bundle.min);
        System.out.println("———————————————————————————————————————-———————————————————————————");
    }
}

//
//        System.out.println(bundle.getType() + " ———— 按照价格排序");
//        bundle.bundles.stream().sorted(Comparator.comparing(Bundle::getPrice)).forEach(System.out::println);
//        System.out.println("———————————————————————————————————————-———————————————————————————");
//
//        System.out.println(bundle.getType() + " ———— 按照bundle排序");
//        bundle.bundles.stream().sorted(Comparator.comparing(Bundle::getBundle)).forEach(System.out::println);
//        System.out.println("———————————————————————————————————————————————————————————————————");
