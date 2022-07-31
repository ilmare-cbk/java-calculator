package com.ilmare.calculator;

import com.ilmare.calculator.operator.Operators;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class ElementDiscriminator {
    private static final Operators operators = new Operators();
    private static final String OPEN_BRACKET = "(";
    private static final String CLOSE_BRACKET = ")";

    public Element discriminate(String element) {
        if (isNumber(element)) {
           return Element.NUMBER;
        }
        else if (isOperator(element)) {
            return Element.OPERATOR;
        }
        else if (OPEN_BRACKET.equals(element)) {
            return Element.OPEN_BRACKET;
        }
        else if (CLOSE_BRACKET.equals(element)) {
            return Element.CLOSE_BRACKET;
        }
        else {
            throw new NotImplementedException();
        }

    }

    private boolean isNumber(String element) {
        return element.chars().allMatch(Character::isDigit);
    }

    private boolean isOperator(String element) {
        return operators.contains(element);
    }
}
