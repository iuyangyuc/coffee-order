package edu.iu.habahram.coffeeorder.model;

public class Milk extends CondimentDecorator{
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return  beverage.cost() + 0.4;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}
