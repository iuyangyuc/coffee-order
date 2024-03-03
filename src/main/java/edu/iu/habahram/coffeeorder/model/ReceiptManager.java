package edu.iu.habahram.coffeeorder.model;

public class ReceiptManager {
    private static int nextId = 1;
    public static String createReceipt(String description, double cost) {
        Receipt receipt = new Receipt(description, cost);
        int id = nextId++;
        return receipt.toStringWithId(id);
    }
}
