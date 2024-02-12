package edu.iu.habahram.coffeeorder.model;

public class HouseBlend extends Beverage{
    @Override
    public float cost() {
        return 2.99F;
    }

    @Override
    public String getDescription() {
        return "House Blend";
    }
}
