package view;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import control.MaterialManager;
import model.CrispyFlour;
import model.Material;
import model.Meat;

public class Main {
    public static List<Material> materialList = MaterialManager.materialList;

    public static void main(String[] args) {

        MaterialManager newList = new MaterialManager();

        Material crispyflourOne = new CrispyFlour("C01","flour", LocalDate.of(2022,6,8),25000,5);
        Material crispyflourTwo = new CrispyFlour("C02","Tapioca",LocalDate.of(2022,2,18),35000,5);
        Material crispyFlourThree = new CrispyFlour("C03","potato starch",LocalDate.of(2022,3,8),45000,5);
        Material crispyFlourFour = new CrispyFlour("C04","filter powder",LocalDate.of(2022,4,28),30000,5);
        Material crispyflourFive = new CrispyFlour("C05","sourdough",LocalDate.of(2022,6,8),32500,5);
        Material meatOne = new Meat("M01","pork",LocalDate.of(2022,8,10),95000,2);
        Material meatTwo = new Meat("M02","beef",LocalDate.of(2022,8,11),155000,2);
        Material meatThree = new Meat("M03","chicken",LocalDate.of(2022,8,12),75000,2);
        Material meatFour = new Meat("M04","rabbit meat",LocalDate.of(2022,8,13),185000,1);
        Material meatFive = new Meat("M05","fog meat",LocalDate.of(2022,8,14),120000,1);
        newList.addNewMaterial(crispyflourOne);
        newList.addNewMaterial(crispyflourTwo);
        newList.addNewMaterial(crispyFlourThree);
        newList.addNewMaterial(crispyFlourFour);
        newList.addNewMaterial(crispyflourFive);
        newList.addNewMaterial(meatOne);
        newList.addNewMaterial(meatTwo);
        newList.addNewMaterial(meatThree);
        newList.addNewMaterial(meatFour);
        newList.addNewMaterial(meatFive);

        Material meatSix = getMeat();
        Material crispyflourSix= getCrispyFlour();
        newList.addNewMaterial(meatSix);
        newList.addNewMaterial(crispyflourSix);
        newList.showNewMaterial();
        newList.deleteMaterial(meatThree);
        newList.showNewMaterial();
    }
    public static Material getMeat(){
        System.out.println("Enter material: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Id: ");
        String id = scanner.nextLine();
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter year: ");
        int year = scanner.nextInt();
        System.out.println("Enter Month: ");
        int month = scanner.nextInt();
        System.out.println("Enter Day: ");
        int day = scanner.nextInt();
        System.out.println("Enter Cost: ");
        int cost = scanner.nextInt();
        System.out.println("Enter weight: ");
        int weight = scanner.nextInt();
        Material meat = new Meat(id,name,LocalDate.of(year,month,day),cost,weight);
        return meat;
    }
    public static Material getCrispyFlour(){
        System.out.println("Enter material: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Id: ");
        String id = scanner.nextLine();
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter year: ");
        int year = scanner.nextInt();
        System.out.println("Enter Month: ");
        int month = scanner.nextInt();
        System.out.println("Enter Day: ");
        int day = scanner.nextInt();
        LocalDate manufacturingDate = LocalDate.of(year,month,day);
        System.out.println("Enter Cost: ");
        int cost = scanner.nextInt();
        System.out.println("Enter Quantity: ");
        int quantity = scanner.nextInt();
        Material meat = new Meat(id,name,manufacturingDate,cost,quantity);
        return meat;
    }

}
