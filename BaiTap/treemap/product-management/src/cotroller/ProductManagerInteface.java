package cotroller;

import model.Product;

import java.util.ArrayList;


public interface ProductManagerInteface {

    public boolean delete(int code);

    public boolean add(Product product);

    public boolean update(int code, Product product);

    public Product find(int code);
}
