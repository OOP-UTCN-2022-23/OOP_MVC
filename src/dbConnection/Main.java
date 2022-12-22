package dbConnection;


import dbConnection.controllers.ShopController;
import dbConnection.models.Shop;
import dbConnection.views.ShopView;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop("My cul shop");

        ShopView view = new ShopView();

        DatabaseConnection databaseConnection = new DatabaseConnection();

        ShopController controller = new ShopController(view, shop, databaseConnection);
    }
}
