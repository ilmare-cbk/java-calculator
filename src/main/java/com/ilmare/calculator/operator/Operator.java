package com.ilmare.calculator.operator;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;

public enum Operator {
    NONE("", 0),
    SUM("+", 1),
    SUBTRACT("-", 1),
    MULTIPLY("*", 2),
    DIVIDE("/", 2);

    private String operator;
    @Getter
    private Integer priority;

    Operator(String operator, Integer priority) {
        this.operator = operator;
        this.priority = priority;
    }

    public static Operator of(String operator) {
        switch (operator) {
            case "+":
                return Operator.SUM;
            case "-":
                return Operator.SUBTRACT;
            case "*":
                return Operator.MULTIPLY;
            case "/":
                return Operator.DIVIDE;
            default:
                return Operator.NONE;
        }
    }

    public static List<Operator> getValues() {
        return Arrays.asList(SUM, SUBTRACT, MULTIPLY, DIVIDE);
    }

    public boolean compare(Operator operator) {
        return this.getPriority().compareTo(operator.getPriority()) > 0;
    }


}
