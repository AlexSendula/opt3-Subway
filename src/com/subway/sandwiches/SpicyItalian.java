package com.subway.sandwiches;

public class SpicyItalian extends Sandwich{
    String breadUsed = "Italian";
    String[] meatUsed = {"Pepperoni"};
    String[] toppingsUsed = {"Onion", "Green pepper", "Cucumber", "Tomatoe", "Lettuce", "Jalapeno pepper"};
    String[] saucesUsed = {"Mayonaise"};

    boolean wantsCheese() {return false;}

    @Override
    void chooseBread() {
        System.out.printf("Grabbing the %s bread\n", breadUsed);
    }

    @Override
    void addMeat() {
        System.out.print("Adding the meat: ");

        for (String meat : meatUsed) {
            System.out.print(meat + " ");
        }
    }

    @Override
    void addCheese() {
    }

    @Override
    void toast() {
        System.out.println("\nToasting the bread");
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
