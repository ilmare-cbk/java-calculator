package com.ilmare.calculator.operator;

import java.util.List;

public class Operators {
    private List<Operator> values = Operator.getValues();

    public static boolean prioritize(String op1, String op2) {
        Operator operator1 = Operator.of(op1);
        Operator operator2 = Operator.of(op2);
        return operator1.compare(operator2);
    }

    public boolean contains(String operator) {
        return this.values.contains(Operator.of(operator));
    }
}
