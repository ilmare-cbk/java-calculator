package com.ilmare.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    @DisplayName("A+B -> AB+")
    public void test1() {
        Calculator calculator = new Calculator("1+2");
        String postfixExpr = calculator.convertToPostfix();
        Assertions.assertEquals("12+", postfixExpr);
    }

    @Test
    @DisplayName("A+B*C -> ABC*+")
    public void test2() {
        Calculator calculator = new Calculator("1+2*3");
        String postfixExpr = calculator.convertToPostfix();
        Assertions.assertEquals("123*+", postfixExpr);
    }

    @Test
    @DisplayName("A*B+C -> AB*C+")
    public void test3() {
        Calculator calculator = new Calculator("1*2+3");
        String postfixExpr = calculator.convertToPostfix();
        Assertions.assertEquals("12*3+", postfixExpr);
    }

    @Test
    @DisplayName("A*(B+C) -> ABC+*")
    public void test4() {
        Calculator calculator = new Calculator("1*(2+3)");
        String postfixExpr = calculator.convertToPostfix();
        Assertions.assertEquals("123+*", postfixExpr);
    }

    @Test
    @DisplayName("(3+5*(4-6)/2) -> 3546-*2/+")
    public void test5() {
        Calculator calculator = new Calculator("(3+5*(4-6)/2)");
        String postfixExpr = calculator.convertToPostfix();
        Assertions.assertEquals("3546-*2/+", postfixExpr);
    }
}