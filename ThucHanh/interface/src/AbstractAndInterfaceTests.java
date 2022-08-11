import Fruit.Fruit;
import animal.Animal;
import animal.Chichken;
import animal.Tiger;
import edible.Edible;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chichken();

        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chichken) {
                Edible edibler = (Chichken) animal;
                System.out.println(edibler.howToEat());
            }
        }
    }

}
