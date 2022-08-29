package view;


import controller.Mainfuction;
import controller.Mainview;
import model.Hotel;
import rawfiles.RAWFiles;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final int SAVE_DATA_CODE = 9;
    private static final int LOAD_DATA_CODE = 8;

    private static final int SEARCH_BY_NAME_CODE = 6;
    private static final int SEARCH_BY_IDENTITYCARD_CODE = 5;
    private static final int DELETE_BY_IDENTITYCARD_CODE = 4;
    private static final int EDIT_BY_IDENTITYCARD_CODE = 3;
    private static final int ADD_GUESTROOM_CODE = 2;
    private static final int DISPLAY_ALL_CODE = 1;
    private static final String INVALID_OPTION_STRING = "Invalid Option";
    private static final String DATA_FILE_PATH ="file\\guestroom.dat";
    private static final int EXIT_CODE = 0;
    private static final int INIT_VALUE = -1;
    private static List<Hotel> initData() {
        List<Hotel> guestroomsList = new ArrayList<>();

        Hotel guestroom1 = new Hotel("A",10102589,"11/02/1990","Hạng A",1000000, LocalDate.of(2022,8,15));
        Hotel guestroom2 = new Hotel("B",10102589,"11/02/1990","Hạng A",1000000, LocalDate.of(2022,8,15));
        Hotel guestroom3 = new Hotel("C",10102589,"11/02/1990","Hạng A",1000000, LocalDate.of(2022,8,15));
        Hotel guestroom4 = new Hotel("D",10102589,"11/02/1990","Hạng A",1000000, LocalDate.of(2022,8,15));
        Hotel guestroom5 = new Hotel("E",10102589,"11/02/1990","Hạng A",1000000, LocalDate.of(2022,8,15));
        Hotel guestroom6 = new Hotel("F",10102589,"11/02/1990","Hạng A",1000000, LocalDate.of(2022,8,15));

        guestroomsList.add(guestroom1);
        guestroomsList.add(guestroom2);
        guestroomsList.add(guestroom3);
        guestroomsList.add(guestroom4);
        guestroomsList.add(guestroom5);
        guestroomsList.add(guestroom6);

        return guestroomsList;
    }

    public static void main(String[] args) throws IOException {
        Mainview mainview = new Mainview();
        Mainfuction mainfuction = new Mainfuction();
        RAWFiles rawFiles = new RAWFiles();
        List<Hotel> guestroomsList = initData();
        int option = INIT_VALUE;

        while (option != EXIT_CODE) {
            option = mainview.mainMenu();
            switch (option) {
                case EXIT_CODE -> System.exit(EXIT_CODE);
                case DISPLAY_ALL_CODE -> mainview.displayAllProducts(guestroomsList);
                case ADD_GUESTROOM_CODE -> guestroomsList.add(mainview.createGuestroomForm());
                case EDIT_BY_IDENTITYCARD_CODE -> mainfuction.updateGuestroomtByIdentityCard(guestroomsList);
                case DELETE_BY_IDENTITYCARD_CODE -> mainfuction.deleteGuestroomtByIdentityCard(guestroomsList);
                case SEARCH_BY_IDENTITYCARD_CODE -> mainfuction.searchGuestroomtByIdentityCard(guestroomsList);
                case SEARCH_BY_NAME_CODE -> mainfuction.searchGuestroomtByName(guestroomsList);
                case  null: break;
                case LOAD_DATA_CODE :
                    List<Hotel> raw = rawFiles.readFromFile(DATA_FILE_PATH);
                    for (Hotel guestroom : raw) {
                        System.out.println(guestroom);
                    }
                    break;
                case SAVE_DATA_CODE :
                    rawFiles.writeToFile(guestroomsList,DATA_FILE_PATH);
                    break;
                default :
                    System.out.println(INVALID_OPTION_STRING);
                    }


        }
    }
}
