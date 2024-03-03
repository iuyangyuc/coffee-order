package edu.iu.habahram.coffeeorder.model;

public class DarkRoast extends Beverage{
    @Override
    public double cost() { return 1.99; }

    @Override
    public String getDescription() {
        return "Dark roast";
    }


}
