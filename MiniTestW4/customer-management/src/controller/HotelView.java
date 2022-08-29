package controller;

import java.time.LocalDate;

public class HotelView {
    public void displayGuestroom(String name,long identtityCard,String birdthDay,String typeOfRoom, double price, LocalDate dayJoin) {
        System.out.printf("%-5s%-20s%-20s%-20s%-20s%-30s\n", "name", "identtity Card", "birdth day", "type of room","day join");
        System.out.printf("%-5s%-20s%-20s%-20s%-20s%-30s\n", name,identtityCard,typeOfRoom,birdthDay, price, dayJoin);
    }
}
