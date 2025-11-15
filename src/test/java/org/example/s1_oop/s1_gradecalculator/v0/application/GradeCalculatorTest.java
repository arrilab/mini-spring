package org.example.s1_oop.s1_gradecalculator.v0.application;

import org.example.s1_oop.s1_gradecalculator.v0.application.GradeCalculator;
import org.example.s1_oop.s1_gradecalculator.v0.domain.Course;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GradeCalculatorTest {


    // 1. 이수한 과목을 전달하여 평균 학점 계산 요청 --> 학점계산기
    // 2-1. (학점수 * 교과점 평점) 합계 : 학점 계산기 --> 과목(코스)
    // 2-2. 수강 신청 총학점 수                    --> 과목(코스)
    @DisplayName("평균 학점을 계산한다.")
    @Test
    void calculateGradeTest() {
        List<Course> courses = List.of(
                new Course("OOP", 3, "A+"),
                new Course("자료구조", 3, "A+")
        );

        var gradeCalculator = new GradeCalculator(courses);
        double gradeResult = gradeCalculator.calculateGrade();

        assertThat(gradeResult).isEqualTo(4.5);
    }
}
