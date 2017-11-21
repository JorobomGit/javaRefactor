package narrowOrParallel.implementationChange;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Price> prices = new ArrayList<>();

    public void add(Price price) {
        this.prices.add(price);
    }

    public Price calculateTotalPrice() {
        return new Price(prices.stream().mapToInt(Price::getPrice).sum());
    }

    public boolean hasDiscount() {
        return this.calculateTotalPrice().getPrice() >= 100;
    }

    public int numberOfProducts() {
        return this.prices.size();
    }
}
