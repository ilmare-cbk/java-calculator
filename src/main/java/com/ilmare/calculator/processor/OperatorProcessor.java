package com.ilmare.calculator.processor;

import com.ilmare.calculator.Element;
import com.ilmare.calculator.operator.Operators;

import java.util.Stack;

public class OperatorProcessor implements ElementProcessor {
    @Override
    public Element type() {
        return Element.OPERATOR;
    }

    @Override
    public String process(String element, String postfix, Stack<String> stack) {
        if (stack.isEmpty()) {
            stack.push(element);
        } else {
            String lastOperator = stack.peek();
            if (Operators.prioritize(element, lastOperator)) {
                stack.push(element);
            } else {
                postfix = postfix.concat(stack.pop());
                this.process(element, postfix, stack);
            }
        }

        return postfix;
    }
}
