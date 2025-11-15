package org.example.s1_oop.s0_calculator.v3_valueobject.domain.operator;

import org.example.s1_oop.s0_calculator.v3_valueobject.domain.vo.PositiveNumber;

public interface PositiveNumArtimeticOperator {
    boolean supports(String operator);

    int calculate(PositiveNumber operand1, PositiveNumber operand2);
}
