package model;


import java.io.Serializable;

public class Product implements Serializable {
    private static final long serialVersionUID = -7898230272152884703L;

    private int id;
    private String name;
    private String manufacturer;
    private int price;
    private String infomation;

    public Product() {
    }

    public Product(int id, String name, String manufacturer, int price, String infomation) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.infomation = infomation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getInfomation() {
        return infomation;
    }

    public void setInfomation(String infomation) {
        this.infomation = infomation;
    }

}
