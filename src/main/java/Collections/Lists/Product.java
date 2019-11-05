package Collections.Lists;

import java.util.Comparator;

import static java.util.Comparator.comparing;

public class Product {
    public static final Comparator<Product> BY_WEIGHT
            = comparing(Product::getWeight);


    private String type;
    private int weight;

    public Product(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }
}
