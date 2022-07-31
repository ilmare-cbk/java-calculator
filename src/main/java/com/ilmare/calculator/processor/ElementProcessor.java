package com.ilmare.calculator.processor;

import com.ilmare.calculator.Element;

import java.util.Stack;

public interface ElementProcessor {
    Element type();
    String process(String element, String postfix, Stack<String> stack);
}
