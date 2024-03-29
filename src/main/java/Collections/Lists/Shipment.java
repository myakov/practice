package Collections.Lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shipment implements Iterable<Product> {


    private static final int LIGHT_VAN_MAX_WEIGTH = 20;
    private static final int PRODUCT_NOT_PRESENT = -1;
    private final List<Product> productList = new ArrayList<>();
    private List<Product> ligthVanProduct;
    private List<Product> heaveVanProducts;

    public void add(Product product) {
        productList.add(product);

    }

    public void replace(Product product, Product newProduct) {

        final int index = productList.indexOf(product);
        if (index != PRODUCT_NOT_PRESENT) {
            productList.set(index, newProduct);
        }
    }

    public void prepare() {
        productList.sort(Product.BY_WEIGHT);

        int splitPoint = findSplitPoint();

        ligthVanProduct = productList.subList(0, splitPoint);
        heaveVanProducts = productList.subList(splitPoint, productList.size());
    }

    private int findSplitPoint() {
        for (int i = 0; i < productList.size(); i++) {
            final Product product = productList.get(i);
            if (product.getWeight() > LIGHT_VAN_MAX_WEIGTH) {
                return i;
            }
        }
        return 0;
    }


    public List<Product> getHeaveVanProducts() {
        return heaveVanProducts;
    }

    public List<Product> getLightVanProducts() {
        return ligthVanProduct;
    }

    public Iterator<Product> iterator() {
        return productList.iterator();
    }

}
