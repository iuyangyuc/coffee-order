package edu.iu.habahram.coffeeorder.repository;

import edu.iu.habahram.coffeeorder.model.*;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository
public class OrderRepository {
    public Receipt add(OrderData order) throws Exception {
        int id = (int) (System.currentTimeMillis() % Integer.MAX_VALUE);
        Beverage beverage = null;
        switch (order.beverage().toLowerCase()) {
            case "dark roast":
                beverage = new DarkRoast();
                break;
            case "espresso":
                beverage = new Espresso();
                break;
            case "house blend":
                beverage = new HouseBlend();
                break;
            case "decaf":
                beverage = new Decaf();
                break;
        }
        if (beverage == null) {
            throw new Exception("Beverage type '%s' is not valid!".formatted(order.beverage()));
        }
        for(String condiment : order.condiments()) {
            switch (condiment.toLowerCase()) {
                case "milk":
                   beverage = new Milk(beverage);
                   break;
                case "mocha":
                    beverage = new Mocha(beverage);
                    break;
                case "whip":
                    beverage = new Whip(beverage);
                    break;
                case "soy":
                    beverage = new Soy(beverage);
                    break;
                default:
                    throw new Exception("Condiment type '%s' is not valid".formatted(condiment));
            }
        }
        Receipt receipt = new Receipt(id ,beverage.getDescription(), beverage.cost());
        writeReceiptToSQL(receipt);
        appendToFile(Path.of("db.txt"), receipt.toString());
        return receipt;
    }

    private static void appendToFile(Path path, String content) throws IOException {
        content += "\n";
        Files.write(path,
                content.getBytes(StandardCharsets.UTF_8),
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND);
    }

    private static boolean writeReceiptToSQL(Receipt receipt) {
        String url = "jdbc:postgresql://dpg-coh89pmd3nmc73a12l90-a.ohio-postgres.render.com/c322_lab10_7m1s";
        String username = "c322_lab10_7m1s_user";
        String password = "XV2DFSoEXTyplv7lwpMfL9ZWbeIzpshL";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String sql = "INSERT INTO coffee.receipts (id, cost, description) VALUES (?, ?, ?)";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, receipt.id());
            statement.setDouble(2, receipt.cost());
            statement.setString(3, receipt.description());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new receipt was inserted successfully!");
                return true;
            }
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        }
        return false;
    }
}
