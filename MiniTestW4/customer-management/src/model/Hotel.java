package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Hotel extends Customer implements Serializable {
    private String typeOfRoom;
    private double price;
    private LocalDate dayJoin;


    public Hotel(String name, long identityCard, String birthDay, String typeOfRoom, double price, LocalDate dayJoin) {
        super(name, identityCard, birthDay);
        this.typeOfRoom = typeOfRoom;
        this.price = price;
        this.dayJoin = dayJoin;
    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setTypeOfRoom(String typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getDayJoin() {
        return dayJoin;
    }

    public void setDayJoin(LocalDate dayJoin) {
        this.dayJoin = dayJoin;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "typeOfRoom='" + typeOfRoom + '\'' +
                ", price=" + price +
                ", dayJoin=" + dayJoin +
                '}';
    }
}
