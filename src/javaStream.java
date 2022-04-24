public class javaStream {


    public static void main(String[] args) {
        long a = 0;
        try {
            System.out.println(a);
        } catch (RuntimeException e) {

        } catch (Exception e) {
            //check if is runtime exception
            if (e instanceof RuntimeException) {
                System.out.println("RuntimeException");
            }

        }
    }


}
/*

package com.codility;

import java.util.stream.Stream;

class ProductionLineTester {

  private final ProductVerifier verifier;

  ProductionLineTester(ProductVerifier verifier) {
    this.verifier = verifier;
  }

  ProductLineTestReport test(Stream<Product> products) {
    long correctCnt;
    long checkedExcCnt;
    long uncheckedExcCnt;
    long otherExcCnt;

    products.skip(10).limit(20)

  }

public static productMapping(Product product, HashMap<Integer, Integer> values) {

  if(product == null) { //null values
    return null;
  }
  if(productWithInstanceInvalid(product)) {
    return null;
  }
  try {
  verifier.verify(product)
  } catch(Exception e) {
    if (e instanceof ClassNotFoundException) {

    }

      if (e instanceof Interrum) {

    }

      if (e instanceof ClassNotFoundException) {

    }

      if (e instanceof ClassNotFoundException) {

    }
  }

  values.put(1, values.get(1) + 1);
}




public static ProductLineTestReport newEmptyProductLineTestReport() {
  return new ProductLineTestReport(0,0,0,0);
}

public static productWithInstanceInvalid(Product product) {
  if(product.status != null && product.getStatus().equalsIgnoreCase("invalid")){
    return true;
  }
  return false;
}


}
 */