package com.ilmare.calculator.processor;

import com.ilmare.calculator.Element;

import java.util.Stack;

public class CloseBracketProcessor implements ElementProcessor{
    @Override
    public Element type() {
        return Element.CLOSE_BRACKET;
    }

    @Override
    public String process(String element, String postfix, Stack<String> stack) {
        while (!stack.peek().equals("(")) {
            postfix = postfix.concat(stack.pop());
        }
        stack.pop();

        return postfix;
    }
}
