package org.example.s1_oop.s0_calculator.v3_valueobject.application;

import org.example.s1_oop.s0_calculator.v3_valueobject.domain.operator.*;
import org.example.s1_oop.s0_calculator.v3_valueobject.domain.vo.PositiveNumber;

import java.util.List;

public class Calculator {
    private static final List<PositiveNumArtimeticOperator> operators = List.of(
            new PositiveNumAddtionOperator(),
            new PositiveNumSubtractionOperator(),
            new PositiveNumMultiplicationOperator(),
            new PositiveNumDivisionOperator()
    );

    public static int calculate(PositiveNumber operand1, String operator, PositiveNumber operand2) {
        return operators.stream()
                .filter(op -> op.supports(operator))
                .map(op -> op.calculate(operand1, operand2))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아님"));
    }
}
