package ChristmasShopping;

import java.util.List;

public class ShoppingList {

    List<ShoppingBagOfShop> shops;

    public ShoppingList(List<ShoppingBagOfShop> shops) {
        this.shops = shops;
    }

    public double calculatePrice() {
        return shops.stream()
                .mapToDouble(shop -> shop.getShoppingBag().getTotalPrice())
                .sum();
    }
}
