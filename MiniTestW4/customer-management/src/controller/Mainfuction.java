package controller;

import model.Hotel;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class Mainfuction {
    public void searchGuestroomtByName(List<Hotel> guestroomsList) throws IOException {
        Iterator<Hotel> iterator;
        String nameValue = Mainview.enterNameForm();
        iterator = guestroomsList.iterator();
        while (iterator.hasNext()) {
            Hotel holder = iterator.next();
            if (holder.getName().equalsIgnoreCase(nameValue)) {
                HotelView hotelView = new HotelView();
                HotelManager hotelManager = new HotelManager(holder, hotelView);
                hotelManager.updateGuestroomView();
            }
        }
    }

    public void searchGuestroomtByIdentityCard(List<Hotel> guestroomsList) throws IOException {
        int idValue;
        Iterator<Hotel> iterator;
        idValue = Mainview.enterIdentityCardForm();
        iterator = guestroomsList.iterator();
        while (iterator.hasNext()) {
            Hotel holder = iterator.next();
            if (holder.getIdentityCard() == idValue) {
                HotelView hotelView = new HotelView();
                HotelManager hotelManager = new HotelManager(holder, hotelView);
                hotelManager.updateGuestroomView();
            }
        }
    }
    public void deleteGuestroomtByIdentityCard(List<Hotel> guestroomsList) throws IOException {
        int idValue;
        Iterator<Hotel> iterator;
        idValue = Mainview.enterIdentityCardForm();
        iterator = guestroomsList.iterator();
        while (iterator.hasNext()) {
            Hotel holder = iterator.next();
            if (holder.getIdentityCard() == idValue) {
                guestroomsList.remove(holder);
                break;
            }
        }
    }
    public void updateGuestroomtByIdentityCard(List<Hotel> guestroomsList) throws IOException {
        int idValue;
        Iterator<Hotel> iterator;
        idValue = Mainview.enterIdentityCardForm();
        iterator = guestroomsList.iterator();
        while (iterator.hasNext()) {
            Hotel holder = iterator.next();
            if (holder.getIdentityCard() == idValue) {
                Mainview mainView = new Mainview();
                guestroomsList.set(guestroomsList.indexOf(holder), mainView.createGuestroomForm());
                break;
            }
        }
    }

}
