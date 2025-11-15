package org.example.s1_oop.s0_calculator.v2_interface.domain;

public class AddtionOperator implements ArtimeticOperator {
    @Override
    public boolean supports(String operator) {
        return "+".equals(operator);
    }

    @Override
    public int calculate(int operand1, int operand2) {
        return operand1 + operand2;
    }
}
