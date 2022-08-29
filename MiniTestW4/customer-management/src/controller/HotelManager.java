package controller;

import model.Hotel;

import java.time.LocalDate;


public class HotelManager {
    private Hotel model;

    private HotelView view;

    public HotelManager(Hotel model, HotelView view) {
        this.model = model;
        this.view = view;
    }

    public String getName() {
        return model.getName();
    }

    public void setName(String name) {
        model.setName(name);
    }
    public long getIdentityCard() {
        return model.getIdentityCard();
    }
    public void setIdentityCard(long identtityCard) {
        model.setIdentityCard(identtityCard);
    }
    public String getbirtDay() {
        return model.getBirthDay();
    }
    public void setbirtDay(String birdthDay) {
        model.setBirthDay(birdthDay);
    }
    public String gettypeOfRoom() {
        return model.getTypeOfRoom();
    }
    public void settypeOfRoom(String typeOfRoom) {
        model.setTypeOfRoom(typeOfRoom);
    }
    public double getPrice() {
        return model.getPrice();
    }
    public void setPrice(double price) {
        model.setPrice(price);
    }
    public LocalDate getDayJoin() {
        return model.getDayJoin();
    }

    public void setDayJoin(LocalDate dayJoin) {
        model.setDayJoin(dayJoin);
    }
    public void updateGuestroomView() {
        view.displayGuestroom(model.getName(),model.getIdentityCard(), model.getBirthDay(), model.getTypeOfRoom(),model.getPrice(),model.getDayJoin());
    }
}
