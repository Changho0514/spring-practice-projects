package org.example.OrderService;

public class Cook {

    public Dish makeDish(MenuItem menuItem) {
        Dish dish = new Dish(menuItem);
        return dish;
    }
}
