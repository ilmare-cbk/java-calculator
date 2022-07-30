package com.ilmare.calculator;

import java.util.Stack;

public class Calculator {
    private String infixExpr;       // 중위표기 수식
    private String postfixExpr;     // 후위표기 수식
    private Stack<String> operatorStack = new Stack<>();    // 연산자 스택
}
