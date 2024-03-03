package edu.iu.habahram.coffeeorder.model;

public class Soy extends CondimentDecorator{

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost() { return beverage.cost() + 0.27; }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
