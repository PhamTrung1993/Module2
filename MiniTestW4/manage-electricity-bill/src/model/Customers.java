package model;

import java.io.Serializable;

public class Customers implements Serializable {
    private String name;
    private int number;
    private String electricMeterId;

    public Customers() {
    }

    public Customers(String name, int number, String electricMeterId) {
        this.name = name;
        this.number = number;
        this.electricMeterId = electricMeterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getElectricMeterId() {
        return electricMeterId;
    }

    public void setElectricMeterId(String electricMeterId) {
        this.electricMeterId = electricMeterId;
    }

    @Override
    public String toString() {
        return "customers{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", electricMeterId='" + electricMeterId + '\'' +
                '}';
    }
}
