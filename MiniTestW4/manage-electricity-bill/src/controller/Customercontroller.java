package controller;

import model.Customers;

import java.util.ArrayList;
import java.util.List;

public class Customercontroller {
    private String name;
    public static List<Customers> customersList = new ArrayList<>();

    public void addNewCustomer(Customers customers) {
        customersList.add(customers);
    }
    public void editCustomerById(int index, Customers customers){
        customersList.set(index,customers);
    }

    public Customercontroller(String name, List<Customers> customersList) {
        this.name = name;
        this.customersList = customersList;
    }

    public Customercontroller(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Customers> getCustomersList() {
        return customersList;
    }

    public void setCustomersList(List<Customers> customersList) {
        this.customersList = customersList;
    }
}
