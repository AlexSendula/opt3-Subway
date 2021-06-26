package com.subway.sandwiches;

public abstract class Sandwich {
    public final void makeSandwich() {
        chooseBread();

        if (wantsMeat()) {
            addMeat();
        }

        if (wantsCheese()) {
            addCheese();
        }

        if (wantsToasted()) {
            toast();
        }

        if (wantsToppings()) {
            addToppings();
        }

        if (wantsSauce()) {
            addSauce();
        }

        wrapSandwich();
    }

    abstract void chooseBread();
    abstract void addMeat();
    abstract void addCheese();
    abstract void toast();
    abstract void addToppings();
    abstract void addSauce();

    boolean wantsMeat() {return true;}
    boolean wantsCheese() {return true;}
    boolean wantsToasted() {return true;}
    boolean wantsToppings() {return true;}
    boolean wantsSauce() {return true;}

    public void wrapSandwich() {
        System.out.println("\nThe sandwich is wrapped!");
    }
}
