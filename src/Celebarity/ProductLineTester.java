package Celebarity;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

class ProductionLineTester {

    private final ProductVerifier verifier;

    ProductionLineTester(ProductVerifier verifier) {
        this.verifier = verifier;
    }

    public static boolean productWithInstanceInvalid(Product product) {
        if (product.getStatus() != null && product.getStatus().equalsIgnoreCase("invalid")) {
            return true;
        }
        return false;
    }

    public static ProductLineTestReport newEmptyProductLineTestReport() {
        return new ProductLineTestReport(0, 0, 0, 0);
    }

    public static Iterator sortedIterator(Iterator<Product> it) {
        List<Product> list = new ArrayList();
        while (it.hasNext()) {
            list.add(it.next());
        }
        Collections.sort(list, (a, b) -> a.getId() - b.getId());

        return list.iterator();
    }

    ProductLineTestReport test(Stream<Product> products) {

        //check if products is empty
        if (products == null) {
            return newEmptyProductLineTestReport();
        }
        Iterator<Product> iterator = products.iterator();
        if (!iterator.hasNext()) {
            return newEmptyProductLineTestReport();
        }
        Iterator<Product> iteratorNew = sortedIterator(iterator);


        Map<String, Integer> values = new HashMap<>();
        //stream has already been operated upon or closed
        int i = 0;

        while (iteratorNew.hasNext()) {

            i++;
            Product product = iteratorNew.next();

            System.out.println(product);

/*
       try {
            // create class object
            Class classobj = Product.class;

            // get list of methods
            Method[] methods = classobj.getMethods();

            // get the name of every method present in the list
            for (Method method : methods) {

                String MethodName = method.getName();
                System.out.println("Name of the method: "
                                   + MethodName);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

*/


            if (i <= 10) {
                continue;
            }
            if (i > 20) {
                break;
            }


            if (product == null) { //null values
                //return newEmptyProductLineTestReport();
                continue;
            }

            if (productWithInstanceInvalid(product)) {
                continue;
            }

            try {
                verifier.verify(product);
            } catch (Exception e) {
                if (e instanceof ClassNotFoundException || e instanceof NullPointerException
                        || e instanceof InterruptedException || e instanceof IOException
                        || e instanceof InstantiationException || e instanceof SQLException
                        || e instanceof FileNotFoundException) {
                    values.put("checkedExcCnt", values.getOrDefault("checkedExcCnt", 1) + 1);
                    continue;
                } else {
                    values.put("checkedExcCnt", values.getOrDefault("uncheckedExcCnt", 1) + 1);
                    continue;
                }
            } catch (Error e) {
                values.put("checkedExcCnt", values.getOrDefault("otherExcCnt", 1) + 1);
                continue;
            }

            values.put("correctCnt", values.getOrDefault("correctCnt", 1) + 1);
        }

        long correctCnt = values.getOrDefault("correctCnt", 0);
        long checkedExcCnt = values.getOrDefault("checkedExcCnt", 0);
        long uncheckedExcCnt = values.getOrDefault("uncheckedExcCnt", 0);
        long otherExcCnt = values.getOrDefault("otherExcCnt", 0);

        return new ProductLineTestReport(correctCnt, checkedExcCnt, uncheckedExcCnt, otherExcCnt);
    }
}