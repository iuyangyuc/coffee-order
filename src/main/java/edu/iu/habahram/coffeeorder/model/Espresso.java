package edu.iu.habahram.coffeeorder.model;

public class Espresso extends Beverage{
    @Override
    public float cost() {
        return 3.99F;
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }
}
