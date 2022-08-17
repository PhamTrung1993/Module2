package codegym;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MaterialManager {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter =  DateTimeFormatter.ofPattern("d-MM-yyyy");
        Material crispyflourOne = new CrispyFlour("C01","flour", LocalDate.parse("15-08-2022", dateTimeFormatter),25000,5);
        Material crispyflourTwo = new CrispyFlour("C02","Tapioca",LocalDate.parse("15-08-2022", dateTimeFormatter),35000,5);
        Material crispyFlourThree = new CrispyFlour("C03","potato starch",LocalDate.parse("15-08-2022", dateTimeFormatter),45000,5);
        Material crispyFlourFour = new CrispyFlour("C04","filter powder",LocalDate.parse("15-08-2022", dateTimeFormatter),30000,5);
        Material crispyflourFive = new CrispyFlour("C05","sourdough",LocalDate.parse("15-08-2022", dateTimeFormatter),32500,5);
        Material meatOne = new Meat("M01","pork",LocalDate.parse("15-08-2022", dateTimeFormatter),95000,2);
        Material meatTwo = new Meat("M02","beef",LocalDate.parse("15-08-2022", dateTimeFormatter),155000,2);
        Material meatThree = new Meat("M03","chicken",LocalDate.parse("15-08-2022", dateTimeFormatter),75000,2);
        Material meatFour = new Meat("M04","rabbit meat",LocalDate.parse("15-08-2022", dateTimeFormatter),185000,1);
        Material meatFive = new Meat("M05","fog meat",LocalDate.parse("15-08-2022", dateTimeFormatter),120000,1);


        Material listmaterial[] = {crispyflourOne,crispyflourTwo,crispyFlourThree,crispyFlourFour,crispyflourFive,
                                    meatOne,meatTwo,meatThree,meatFour,meatFive};
        showarray(listmaterial);
        Material meatSix = new Meat("M08", "Buffalo meat",LocalDate.parse("15-08-2022", dateTimeFormatter),170000,1);
        Material newListMaterial[] = addElement(listmaterial,meatSix,6);
        showarray(newListMaterial);
        System.out.print("\n");
        deleteElement(newListMaterial,6);
    }
    public static Material[] addElement(Material[] array,Material element,int index) {
        int oldlength = array.length;
        int newlength = oldlength + 1;

        Material[] newarray = new Material[newlength];

        for (int i = 0; i < index; i++) {
            newarray[i] = array[i];
        }
        newarray[index] = element;
        for (int i = index+1; i < newlength; i++) {
            newarray[i] = array[i-1];
        }
        return newarray;

    }

    public static void deleteElement(Material[] array,int index) {
        int checklength,i;

        for (checklength = i = 0; i < array.length; i++) {
            if (i != (index - 1)) {
                array[checklength] = array[i];
                checklength++;
            }
        }
        int newlength = checklength;
        Material[] newarray = new Material[newlength];

        for (int j = 0; j < newlength;j++) {
            newarray[j] = array[j];
        }
        showarray(newarray);
    }

    public static void showarray(Material[] array){
        for (Material element: array) {
            System.out.println(element);
        }

    }
}
