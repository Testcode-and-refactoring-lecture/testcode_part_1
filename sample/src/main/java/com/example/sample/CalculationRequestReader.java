package com.example.sample;

import java.util.Scanner;

public class CalculationRequestReader {

    public CalculationRequest read(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number and an operator ( e.g 1 + 2): ");
        String result = scanner.nextLine();
        String[] parts = result.split(" ");;

        return new CalculationRequest(parts); // 아 객체 반환이니까 그냥 여기서 new 생성해서 ㅂ반환
    }
}
