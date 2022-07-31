package com.ilmare.calculator;

import com.ilmare.calculator.processor.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class InfixToPostfixConverter {
    private String infix;
    private String postfix = "";
    private Stack<String> stack = new Stack<>();
    private List<ElementProcessor> processors = Arrays.asList(new NumberProcessor(), new OperatorProcessor(), new OpenBracketProcessor(), new CloseBracketProcessor());
    private ElementDiscriminator discriminator = new ElementDiscriminator();

    public InfixToPostfixConverter(String infix) {
        this.infix = infix;
    }

    public String convert() {
        for (int i = 0; i < infix.length(); i++) {
            String element = infix.substring(i, i + 1);
            Element type = discriminator.discriminate(element);
            ElementProcessor processor = getProcessor(type);
            postfix = processor.process(element, postfix, stack);
        }

        while (!stack.isEmpty()) {
            postfix = postfix.concat(stack.pop());
        }

        return postfix;
    }

    private ElementProcessor getProcessor(Element type) {
        return processors.stream()
                .filter(processor -> processor.type() == type)
                .findAny()
                .orElseThrow(NotImplementedException::new);
    }

}
