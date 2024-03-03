package edu.iu.habahram.coffeeorder.model;

public class Decaf extends Beverage{
    @Override
    public double cost() { return 1.28; }

    @Override
    public String getDescription() { return "Decaf"; }
}
