package ChristmasShopping;

public class ShoppingBagOfShop {
    private String ShopName;
    private ShoppingBag shoppingBag;

    public ShoppingBagOfShop(String shopName, ShoppingBag shoppingBag) {
        ShopName = shopName;
        this.shoppingBag = shoppingBag;
    }

    public String getShopName() {
        return ShopName;
    }

    public ShoppingBag getShoppingBag() {
        return shoppingBag;
    }
}
