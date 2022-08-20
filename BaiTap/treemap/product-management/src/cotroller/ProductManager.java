package cotroller;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class ProductManager implements ProductManagerInteface {
    public static List<Product> products;

    public ProductManager() {
        products = new ArrayList<>();

        this.add(new Product(1,"Bánh bao",15000,"Hà Nội"));
        this.add(new Product(2,"Bánh mì trứng",15000,"Hà Nội"));
        this.add(new Product(3,"Xôi Xéo",10000,"Hà Nội"));
        this.add(new Product(4,"Bánh khúc",15000,"Hà Nội"));
        this.add(new Product(5,"Bánh gạo",7500,"Hà Nội"));

    }



    @Override
    public boolean add(Product product) {
        if (products.contains(product.getId())){
            return false;
        }
        products.add(product);
            return true;
    }

    @Override
    public boolean delete(int id) {
        try {
            products.remove(id);
            return true;
        } catch (Throwable a) {
            return false;
        }
    }

    @Override
    public boolean update(int id, Product product) {
        if (products.contains(product.getId())){
            products.add(product.getId(),product);
            return true;
        }
        return false;
    }

    @Override
    public Product find(int id) {
        if (products.contains(id)) {
            return products.get(id);
        }
        return null;
    }
    public void show(){
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
    }
}
