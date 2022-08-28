package controller;

import model.Hotel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Mainview {
    public Hotel createGuestroomForm() throws NumberFormatException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(">>>>>>>>ADD NEW PRODUCT<<<<<<<<<");
        System.out.print("1. Enter guest name: ");
        String name = bufferedReader.readLine();
        System.out.print("1. Enter guest identityCard: ");
        long identityCard = Long.parseLong(bufferedReader.readLine());
        System.out.print("1. Enter guest birthDay: ");
        String birthDay = bufferedReader.readLine();
        System.out.print("1. Enter guest typeOfRoom: ");
        String typeOfRoom = bufferedReader.readLine();
        System.out.print("1. Enter room price: ");
        int price = Integer.parseInt(bufferedReader.readLine());
        System.out.print("1. Enter guest day join: ");
        int dayJoin = Integer.parseInt(bufferedReader.readLine());
        System.out.print("1. Enter guest month join: ");
        int monthJoin = Integer.parseInt(bufferedReader.readLine());
        System.out.print("1. Enter guest year join: ");
        int yearJoin = Integer.parseInt(bufferedReader.readLine());

        Hotel newguestroom = new Hotel(name, identityCard, birthDay, typeOfRoom, price, LocalDate.of(yearJoin,monthJoin,dayJoin));
        return newguestroom;
    }
    public int mainMenu() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int option;
        System.out.println("============== MAIN MENU =============");
        System.out.println("1. Display guestroom");
        System.out.println("2. Add new guestroom");
        System.out.println("3. Edit guestroom by ID");
        System.out.println("4. Delete guestroom by ID");
        System.out.println("5. Search guestroom by ID");
        System.out.println("6. Search guestroom by Name");

        System.out.println("8. Load guestroom from database");
        System.out.println("9. Save guestroom to database");
        System.out.println(" .....................................");
        System.out.println("0. Quit");
        System.out.println("Enter option: ");
        option = Integer.parseInt(bufferedReader.readLine());
        return option;
    }
}
