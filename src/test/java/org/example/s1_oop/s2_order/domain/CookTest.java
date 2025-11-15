package org.example.s1_oop.s2_order.domain;

import org.example.s1_oop.s2_order.domain.Cook;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

class CookTest {
    @DisplayName("요리를 생성함")
    @Test
    void createCook() {
        assertThatCode(() -> new Cook("만두", 5000))
                .doesNotThrowAnyException();
    }
}