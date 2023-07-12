package com.example.sample;

public class Calculator {
    public long calculate(long num1, String operator, long num2){

        return switch (operator) {
            /// java 12 부터 추가된 문법 ㄷ ㄷ 하지만 다음강의는
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> throw new InvalidOperatorException();
        };
    }
}
