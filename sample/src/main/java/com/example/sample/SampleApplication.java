package com.example.sample;

import java.util.Scanner;

public class SampleApplication {
    public static void main(String[] args) {

        String[] parts = new CalculationRequestReader().read();

        CalculationRequest calculationRequest = new CalculationRequest(parts);

        long answer = new Calculator().calculate(calculationRequest.getNum1(), calculationRequest.getOperator(), calculationRequest.getNum2()); // 아 이래서 getter를 썻군요
        System.out.println(answer);

    }

}
