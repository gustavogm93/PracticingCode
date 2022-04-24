package Celebarity;

import java.util.stream.Stream;

public class MainTest {

    public static void main(String[] args) {
        ProductVerifier pv = new ProductVerifier();
        ProductionLineTester pdlt = new ProductionLineTester(pv);

        //create stream of Product
        Stream<Product> productStream = Stream.of(new Product("1", "A", "invalid"), new Product("2", "B", "turko"), new Product("3", "C", "para")
                , new Product("4", "D", "turko"), new Product("5", "E", "turko"), new Product("6", "F", "turko"), new Product("7", "G", "turko")
                , new Product("8", "H", "turko"), new Product("9", "I", "turko"), new Product("10", "J", "turko"), new Product("11", "K", "turko")
                , null, new Product("13", "M", "turko"), new Product("14", "N", "turko"), new Product("15", "O", "turko")
                , new Product("16", "P", "turko"), new Product("17", "Q", "turko"), new Product("18", "R", "turko"), new Product("19", "S", "turko")
                , new Product("20", "T", "turko"), new Product("21", "U", "turko"), new Product("22", "V", "turko"), new Product("23", "W", "turko")
                , new Product("24", "X", "turko"), new Product("25", "Y", "turko"), new Product("26", "Z", "turko"), new Product("27", "AA", "turko"));


        ProductLineTestReport a = pdlt.test(productStream);
        ProductLineTestReport.class.toString();
        //you are working as a tester in a factory. Your goal is to implement  a ProductionLineTester.test() method which


        System.out.println(a);

    }
}
