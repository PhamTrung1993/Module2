package controller;

import model.Hotel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

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

        Hotel newguestroom = new Hotel(name, identityCard, birthDay, typeOfRoom, price, LocalDate.of(yearJoin, monthJoin, dayJoin));
        return newguestroom;
    }

    public int mainMenu() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int option;
        System.out.println("============== MAIN MENU =============");
        System.out.println("1. Display guestroom");
        System.out.println("2. Add new guestroom");
        System.out.println("3. Edit guestroom by IdentityCard");
        System.out.println("4. Delete guestroom by IdentityCard");
        System.out.println("5. Search guestroom by IdentityCard");
        System.out.println("6. Search guestroom by Name");
        System.out.println("7. Check-out customers");
        System.out.println("8. Load guestroom from database");
        System.out.println("9. Save guestroom to database");
        System.out.println(" .....................................");
        System.out.println("0. Quit");
        System.out.println("Enter option: ");
        option = Integer.parseInt(bufferedReader.readLine());
        return option;
    }

    public void displayAllProducts(List<Hotel> guestroomList) {
        System.out.println("################ DISPLAY ALL GUESTROOM ################");
        Iterator<Hotel> iterator = guestroomList.iterator();
        while (iterator.hasNext()) {
            Hotel holder = iterator.next();
            System.out.printf("%-5s%-20s%-20s%-20s%-20s%-30s\n", holder.getName(), holder.getIdentityCard(), holder.getBirthDay(), holder.getTypeOfRoom(),
                    holder.getPrice(), holder.getDayJoin());
        }
        System.out.println("..................................................................");
    }
    public static int enterIdentityCardForm() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int value;
        System.out.println("--------------- ENTER IDENTITYCARD FORM -----------------");
        System.out.print("Enter product IdentityCard: ");
        value = Integer.parseInt(bufferedReader.readLine());
        return value;
    }
    public static String enterNameForm() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String value;
        System.out.println("--------------- ENTER NAME FORM -----------------");
        System.out.print("Enter product name: ");
        value = bufferedReader.readLine();
        return value;
    }
}
