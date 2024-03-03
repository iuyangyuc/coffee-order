package edu.iu.habahram.coffeeorder.model;

public class HouseBlend extends Beverage{
    @Override
    public double cost() { return 1.65; }

    @Override
    public String getDescription() {
        return "House Blend";
    }
}
