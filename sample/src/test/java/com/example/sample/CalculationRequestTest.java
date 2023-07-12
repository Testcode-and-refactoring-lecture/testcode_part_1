package com.example.sample;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculationRequestTest {

    @Test
    public void 유효한숫자를파싱할수있다() {
        //given
        String[] parts = new String[]{"2", "+", "3"};

        //when
        CalculationRequest calculationRequest = new CalculationRequest(parts);

        //then
        assertEquals(2, calculationRequest.getNum1());
        assertEquals(3, calculationRequest.getNum2());
        assertEquals("+", calculationRequest.getOperator());
    }
    @Test
    public void 자리수_많이_유효한숫자를파싱할수있다() {
        //given
        String[] parts = new String[]{"2222", "+", "3333"};

        //when
        CalculationRequest calculationRequest = new CalculationRequest(parts);

        //then
        assertEquals(2222, calculationRequest.getNum1());
        assertEquals(3333, calculationRequest.getNum2());
        assertEquals("+", calculationRequest.getOperator());
    }
    @Test
    public void 유효한_길이_숫자가_아닐때_에러를_던진다() {
        //given
        String[] parts = new String[]{"2222", "+"};

        //when
        
        //then
        assertThrows(BadRequestException.class,()->{
            new CalculationRequest(parts);
        });
    }
    public void 유효하지_않은_연산자_에러를_던진다() {
        //given
        String[] parts = new String[]{"2222", "x","555"};

        //when
        //then
        assertThrows(InvalidOperatorException.class,()->{
            new CalculationRequest(parts);
        });
    }
    public void 유효하지_않은_연산자_길이_에러를_던진다() {
        //given
        String[] parts = new String[]{"2222", "+*","555"};

        //when

        //then
        assertThrows(InvalidOperatorException.class,()->{
            new CalculationRequest(parts);
        });
    }
}
