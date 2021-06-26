package com.subway.sandwiches;

public class ChickenFillet extends Sandwich{
    String breadUsed = "Plain";
    String[] meatUsed = {"Chicken strips"};
    String[] cheeseUsed = {"Provalone cheese"};
    String[] toppingsUsed = {"Onion", "Green pepper", "Cucumber", "Tomatoe", "Lettuce"};
    String[] saucesUsed = {"Honey-Mustard sauce"};

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
        System.out.print("Adding the cheese: ");

        for (String cheese : cheeseUsed) {
            System.out.print(cheese + " ");
        }
    }

    @Override
    void toast() {
        System.out.println("Toasting the bread");
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
