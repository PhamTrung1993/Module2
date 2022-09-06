package codegym;

public abstract class Meal {
    public final void doMeal() {
        prepareIngedients();
        cook();
        eat();
        cleanUp();
    }
    public abstract void prepareIngedients();
    public abstract void cook();

    public void eat(){
        System.out.println("Mmm, that's good");
    }
    public abstract void cleanUp();
}
