package edu.iu.habahram.coffeeorder.model;

import java.util.List;

public record OrderData(String beverage, List<String> condiments) {
    public String toString() {
        return "beverage=" + this.beverage + ", condiments=" + this.condiments;
    }

    public String fromLine(String line) {
        String[] parts = line.split(", ");
        return parts[0];
    }
}
