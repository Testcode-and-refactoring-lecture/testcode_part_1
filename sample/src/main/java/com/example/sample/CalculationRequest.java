package com.example.sample;

public class CalculationRequest {
    private final long num1;  // 멤버변수를 final로 만들어서 VO만들어버려~ VO만들었으니 데이터를 검증하는 로직을 추가해야함 항상 유효해야하니까
    private final long num2;
    private final String operator;

    public CalculationRequest(String[] parts){
        if(parts.length !=3){
            throw new  BadRequestException();
        }
        String operator = parts[1];
        if(parts[1].length() !=1||isInvalidOperator(operator)){
            throw new InvalidOperatorException();
        }

        this.num1 = Long.parseLong(parts[0]);
        this.num2 = Long.parseLong(parts[2]);
        this.operator = operator;
    }

    private static boolean isInvalidOperator(String operator) { // 값을 다 들고 있을 필요가 없으면 비교할 것만 들고 있도록 바꾸자
        return !operator.equals("+") &&
                !operator.equals("-") &&
                !operator.equals("*") &&
                !operator.equals("/");
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
