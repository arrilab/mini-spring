package org.example.s1_oop.s1_gradecalculator.v1.domain;

import org.example.s1_oop.s1_gradecalculator.v1.domain.Course;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class CourseTest {

    @DisplayName("과목(코스)를 생성함")
    @Test
    void createTest() {
        assertThatCode(() -> new Course("OOP", 3, "A+"))
                .doesNotThrowAnyException();
    }
}
