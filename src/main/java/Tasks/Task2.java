package Tasks;

import Address.Address;
import Orders.Order;
import Products.Apple;
import Products.Orange;
import Products.Product;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Apple apple = new Apple(300, "apple", 100, "red");
        Orange orange = new Orange(500, "orange", 100, false);
        Address address = new Address("Russia", "Moscow", "Tverskaya", 12, 1, 2);
        List<Product> products = new ArrayList<>();
        products.add(apple);
        products.add(orange);

        List<Order> orders = new ArrayList<>();
        for (int x = 1; x <= 100; x++) {
            Order order = new Order(products, address);
            orders.add(order);
        }

        FileWriter fileWriter = new FileWriter("src/orders.json");
        mapper.writeValue(fileWriter, orders);
        FileReader fileReader = new FileReader("src/orders.json");
        Order[] ordersOut = mapper.readValue(fileReader, Order[].class);
        System.out.println(mapper.writeValueAsString(ordersOut));
    }
}
