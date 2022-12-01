package mvc;

import mvc.controllers.ShopController;
import mvc.models.Candy;
import mvc.models.Shop;
import mvc.views.ShopView;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Candy> candies = new ArrayList<>();
        candies.add(new Candy("Twix", 12));
        candies.add(new Candy("Lion", 14));

        Shop shop = new Shop("Lindt");
        shop.setCandies(candies);

        ShopView view = new ShopView();
        ShopController controller = new ShopController(view, shop);
    }
}
