package edu.iu.habahram.coffeeorder.model;

public record Receipt(String description, float cost) {
    public String toStringWithId(int id) {
        return id + ", " + cost + ", " + description;
    }
}

