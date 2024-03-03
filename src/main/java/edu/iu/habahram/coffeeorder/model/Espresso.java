package edu.iu.habahram.coffeeorder.model;

public class Espresso extends Beverage{
    @Override
    public double cost() { return 1.34; }

    @Override
    public String getDescription() {
        return "Espresso";
    }
}
