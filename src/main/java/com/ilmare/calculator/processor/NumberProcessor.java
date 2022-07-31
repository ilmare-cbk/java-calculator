package com.ilmare.calculator.processor;

import com.ilmare.calculator.Element;

import java.util.Stack;

public class NumberProcessor implements ElementProcessor {
    @Override
    public Element type() {
        return Element.NUMBER;
    }

    @Override
    public String process(String element, String postfix, Stack<String> stack) {
        return postfix.concat(element);
    }
}
