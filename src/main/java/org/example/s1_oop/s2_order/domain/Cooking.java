package org.example.s1_oop.s2_order.domain;

public class Cooking {
    public Cook makeCook(MenuItem menuItem) {
        return new Cook(menuItem);
    }
}
