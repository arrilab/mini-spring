package org.example.s1_oop.s2_order.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class MenuTest {

    @DisplayName("메뉴 이름에 해당하는 메뉴를 반환한다.")
    @Test
    void choose_returnsMenuItem() {
        // given
        var menu = new Menu(List.of(
                new MenuItem("돈까스", 5000),
                new MenuItem("냉면", 7000)
        ));

        // when
        MenuItem menuItem = menu.choose("돈까스");

        // then
        assertThat(menuItem).isEqualTo(new MenuItem("돈까스", 5000));
    }

    @DisplayName("메뉴판에 없는 메뉴를 선택할 경우 예외가 발생한다.")
    @Test
    void choose_throwsException_whenMenuNotExist() {
        // given
        var menu = new Menu(List.of(
                new MenuItem("돈까스", 5000),
                new MenuItem("냉면", 7000)
        ));

        // when & then
        assertThatThrownBy(() -> menu.choose("통닭"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("잘못된 메뉴이름: 통닭");
    }
}
