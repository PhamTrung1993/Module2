package codegym;

public class MaterialManager {
    public static void main(String[] args) {
        Material crispyflourOne = new CrispyFlour("C01","flour","22,02,15",25000,5);
        Material crispyflourTwo = new CrispyFlour("C02","Tapioca","22,02,15",35000,5);
        Material crispyFlourThree = new CrispyFlour("C03","potato starch","22,02,15",45000,5);
        Material crispyFlourFour = new CrispyFlour("C04","filter powder","22,02,15",30000,5);
        Material crispyflourFive = new CrispyFlour("C05","sourdough","22,02,15",32500,5);
        Material meatOne = new Meat("M01","pork","22,02,15",95000,2);
        Material meatTwo = new Meat("M02","beef","22,02,15",155000,2);
        Material meatThree = new Meat("M03","chicken","22,02,15",75000,2);
        Material meatFour = new Meat("M04","rabbit meat","22,02,15",185000,1);
        Material meatFive = new Meat("M05","fog meat","22,02,15",120000,1);

        Material listmaterial[] = {crispyflourOne,crispyflourTwo,crispyFlourThree,crispyFlourFour,crispyflourFive,
                                    meatOne,meatTwo,meatThree,meatFour,meatFive};
    }
    public static void addElement(Material[] array) {

    }
}
