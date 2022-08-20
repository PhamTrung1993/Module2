package model;

public class Product {
    int Id;
    String name;
    double price;
    String origin = "null";

    public Product(int id, String name, double price, String origin) {
        this.Id = id;
        this.name = name;
        this.price = price;
        this.origin = origin;
    }

    public int getId() {
        return this.Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }


    @Override
    public String toString() {
        return "Product{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", origin='" + origin + '\'' +
                '}';
    }
}
