import del.UserDatabase;
import entities.Order;
import entities.Product;
import entities.ProductFactory;
import entities.UserAccount;

import java.util.ArrayList;
import java.util.List;

public class ShopWorldAppp {

    public static void main(String[] args) {
        UserDatabase userDatabase = UserDatabase.getInstance();

        System.out.println("==============================================");
        System.out.println(userDatabase);

        Product clothingProduct = ProductFactory.createProduct("Clothing");
        Product electronicProduct = ProductFactory.createProduct("Electronic");

        System.out.println("==============================================");
        clothingProduct.displayInfo();
        electronicProduct.displayInfo();

        UserAccount.UserAccountBuilder userAccount = new UserAccount.UserAccountBuilder("Shishir", "HisPassword");

        System.out.println("==============================================");
        System.out.println(userAccount);

        List<Product> products = new ArrayList<>();
        Order.OrderBuilder order = new Order.OrderBuilder("24683579",products);

        System.out.println("==============================================");
        System.out.println(order);
    }
}
