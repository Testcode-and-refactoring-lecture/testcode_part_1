package com.example.sample;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void 덧셈_연산을_할_수_있다() {
        //given
        long num1 = 2;
        String operator = "+";
        long num2 = 3;
        Calculator calculator = new Calculator();

        //when
        long result = calculator.calculate(num1, operator, num2);

        //then
        assertEquals(5,result); //junit의 assertion
        assertThat(result).isEqualTo(5);// assertj 의 assertion 이건 의존성을 또 주입 받아야해 ~ 더쉽게 해주는
    }
}
