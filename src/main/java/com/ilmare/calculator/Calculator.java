package com.ilmare.calculator;

public class Calculator {
    private String infixExpr;               // 중위표기 수식

    public Calculator(String infixExpr) {
        this.infixExpr = infixExpr;
    }

    public String convertToPostfix() {
        InfixToPostfixConverter converter = new InfixToPostfixConverter(infixExpr);
        return converter.convert();
    }
}
