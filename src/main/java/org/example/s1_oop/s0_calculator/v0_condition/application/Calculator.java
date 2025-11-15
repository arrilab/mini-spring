package org.example.s1_oop.s0_calculator.v0_condition.application;

import org.example.s1_oop.s0_calculator.v0_condition.domain.ArithmeticCalculate;

public class Calculator {

    public static int calculate(int op1, String or, int op2) {
        return ArithmeticCalculate.calculate(op1, or, op2);
    }
}
