package org.example.s1_oop.s2_order.domain;

import org.example.s1_oop.s2_order.domain.MenuItem;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

class MenuItemTest {
    @DisplayName("메뉴 항목을 생성함")
    @Test
    void createMenuItem() {
        assertThatCode(() -> new MenuItem("만두", 5000))
                .doesNotThrowAnyException();
    }

}