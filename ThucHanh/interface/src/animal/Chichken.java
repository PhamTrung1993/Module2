package animal;

import edible.Edible;

public class Chichken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck - cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
