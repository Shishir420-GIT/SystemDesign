package entities;
/*
Facotry Design pattern
 */
public class ProductFactory {

    public static Product createProduct(String category){

        switch (category.toLowerCase()) {
            case "electronic":
                return new ElectronicProduct();
            case "clothing":
                return new ClothingProduct();
            default:
                return (Product) new IllegalArgumentException("Invalid category: " + category);


        }
    }
}
