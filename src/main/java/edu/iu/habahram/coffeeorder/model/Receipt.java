package edu.iu.habahram.coffeeorder.model;

public record Receipt(String description, double cost) {
    public String toStringWithId(int id) {
        return id + ", " + cost + ", " + description;
    }
}

