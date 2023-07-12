package com.example.sample;

import java.util.Scanner;

public class SampleApplication {
    public static void main(String[] args) {

        CalculationRequest calculationRequest = new CalculationRequestReader().read();


        //자세히 보면 read 리턴값이 다시 요기 파라미터로 들어가자나 그러면 그냥 CalculationRequest 구조체를 만들었으니 이걸 리턴값으로 하자는뜻..!

        long answer = new Calculator().calculate(calculationRequest.getNum1(), calculationRequest.getOperator(), calculationRequest.getNum2()); // 아 이래서 getter를 썻군요
        System.out.println(answer);

    }

}
