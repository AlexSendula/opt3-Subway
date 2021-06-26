package com.subway.sandwiches;

public class Veggie extends Sandwich{

    String breadUsed = "Whole grain";
    String[] toppingsUsed = {"Onion", "Green pepper", "Cucumber", "Tomatoe", "Lettuce"};
    String[] saucesUsed = {"Oil", "Vinegar"};

    boolean wantsMeat() {return false;}
    boolean wantsCheese() {return false;}
    boolean wantsToasted() {return false;}

    @Override
    void chooseBread() {
        System.out.printf("Grabbing the %s bread\n", breadUsed);
    }

    @Override
    void addMeat() {
    }

    @Override
    void addCheese() {
    }

    @Override
    void toast() {
    }

    @Override
    void addToppings() {
        System.out.print("Adding the toppings: ");

        for (String topping : toppingsUsed) {
            System.out.print(topping + " ");
        }
    }

    @Override
    void addSauce() {
        System.out.print("\nAdding the condiments: ");

        for (String condiment : saucesUsed) {
            System.out.print(condiment + " ");
        }
    }
}
