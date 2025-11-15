package org.example.s1_oop.s2_order.domain;

public class Customer {
    public Cook order(String menuName, Menu menu, Cooking cooking) {
        MenuItem menuItem = menu.choose(menuName);
        return cooking.makeCook(menuItem);
    }
}
