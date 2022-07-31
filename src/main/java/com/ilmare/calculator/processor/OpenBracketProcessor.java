package com.ilmare.calculator.processor;

import com.ilmare.calculator.Element;

import java.util.Stack;

public class OpenBracketProcessor implements ElementProcessor{
    @Override
    public Element type() {
        return Element.OPEN_BRACKET;
    }

    @Override
    public String process(String element, String postfix, Stack<String> stack) {
        stack.push(element);
        return postfix;
    }
}
