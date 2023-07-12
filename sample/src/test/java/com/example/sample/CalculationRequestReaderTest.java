package com.example.sample;

import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;

public class CalculationRequestReaderTest {


    @Test
    public void System_in으로_데이터를_읽어들일_수_있다(){
        //given
        CalculationRequestReader calculationRequestReader = new CalculationRequestReader();

        //whne
        System.setIn(new ByteArrayInputStream("2 + 3".getBytes())); // 알아서 사용자 입력을 넣어줌
        CalculationRequest result = calculationRequestReader.read();

        //then
        assertEquals("2", result.getNum1());
        assertEquals("+", result.getOperator());
        assertEquals("3", result.getNum2());
    }
}
