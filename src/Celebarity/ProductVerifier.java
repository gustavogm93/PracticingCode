package Celebarity;

public class ProductVerifier {

    public ProductVerifier() {
    }

    public static boolean verify(Product product) throws Exception {
        if (product.getDescription().equals("K")) {
            throw new Exception("Product price is negative");
        }

        return true;
    }

}
