package org.example.s1_oop.s2_order.domain;

import org.example.s1_oop.s2_order.domain.Cook;
import org.example.s1_oop.s2_order.domain.Cooking;
import org.example.s1_oop.s2_order.domain.MenuItem;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CookingTest {
    @DisplayName("메뉴에 해당하는 음식을 만든다.")
    @Test
    void makeCookTest() {
        var cooking = new Cooking();
        var menuItem = new MenuItem("돈까스", 1000);

        Cook cook = cooking.makeCook(menuItem);

        assertThat(cook).isEqualTo(new Cook("돈까스", 1000));
    }
}