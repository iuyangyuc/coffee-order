package edu.iu.habahram.coffeeorder.model;

public class Mocha extends CondimentDecorator{
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() { return  beverage.cost() + 0.3; }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
