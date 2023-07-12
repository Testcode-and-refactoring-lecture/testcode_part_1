package com.example.sample;

public class CalculationRequest {
    private final long num1;  // 멤버변수를 final로 만들어서 VO만들어버려~ 
    private final long num2;
    private String operator;

    public CalculationRequest(String[] parts){
        this.num1 = Long.parseLong(parts[0]);
        this.num2 = Long.parseLong(parts[2]);
        String operator = parts[1];
    }

    public long getNum1() {
        return num1;
    }

    public long getNum2() {
        return num2;
    }

    public String getOperator() {
        return operator;
    }
}
