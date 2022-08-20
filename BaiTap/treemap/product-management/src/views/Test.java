package views;

import cotroller.PriceComporator;
import cotroller.ProductManager;
import model.Product;

import java.util.*;

public class Test {
    public static List<Product> newList = new ArrayList<>();
    public static void main(String[] args) {

        ProductManager newList = new ProductManager();
        newList.show();
        Product product1 = getProduct();
        System.out.println(newList.add(product1));
        newList.show();
        ProductManager.comparatorPrice();

    }

    public static Product getProduct() {
        System.out.println("Enter product: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Id: ");
        int id = scanner.nextInt();
        System.out.println("Enter Price: ");
        int price = scanner.nextInt();
        System.out.println("Enter origin");
        String origin = scanner.nextLine();
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        Product product = new Product(id, name,price, origin);
        return product;
    }

}
