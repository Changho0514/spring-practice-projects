package org.example.OrderService;

import java.util.List;

public class Menu {

    private final List<MenuItem> menuItems;

    public Menu(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public MenuItem choose(String name) {
        return this.menuItems.stream()
                .filter(menuItem -> menuItem.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("메뉴가 존재하지 않습니다."));
    }
}
