package org.example.OrderService;

public class Customer {

    public void order(String menuName, Menu menu, Cook cook) {
        Dish dish = cook.makeDish(menu.choose(menuName));
    }
}
