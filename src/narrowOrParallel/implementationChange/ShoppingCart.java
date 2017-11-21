package narrowOrParallel.implementationChange;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Integer> prices = new ArrayList<>();

    public void add(int price) {
        this.prices.add(price);
    }

    public int calculateTotalPrice() {
        return prices.stream().mapToInt(Integer::intValue).sum();
    }

    public boolean hasDiscount() {
        return this.calculateTotalPrice() >= 100;
    }

    public int numberOfProducts() {
        return this.prices.size();
    }
}
