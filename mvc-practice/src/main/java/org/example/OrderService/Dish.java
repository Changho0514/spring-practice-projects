package org.example.OrderService;

import java.util.Objects;

public class Dish {
    private final String name;
    private final int price;

    public Dish(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Dish(MenuItem menuItem) {
        this.name = menuItem.getName();
        this.price = menuItem.getPrice();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dish dish = (Dish) o;
        return price == dish.price && Objects.equals(name, dish.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
