package com.example.sample;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

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
    @Test
    public void 뺄셈_연산을_할_수_있다() {
        //given
        long num1 = 2;
        String operator = "-";
        long num2 = 3;
        Calculator calculator = new Calculator();

        //when
        long result = calculator.calculate(num1, operator, num2);

        //then
        assertEquals(-1,result); //junit의 assertion
        assertThat(result).isEqualTo(-1);// assertj 의 assertion 이건 의존성을 또 주입 받아야해 ~ 더쉽게 해주는
    }
    @Test
    public void 곱셈_연산을_할_수_있다() {
        //given
        long num1 = 2;
        String operator = "*";
        long num2 = 3;
        Calculator calculator = new Calculator();

        //when
        long result = calculator.calculate(num1, operator, num2);

        //then
        assertEquals(6,result); //junit의 assertion
        assertThat(result).isEqualTo(6);// assertj 의 assertion 이건 의존성을 또 주입 받아야해 ~ 더쉽게 해주는
    }
    @Test
    public void 나눗셈_연산을_할_수_있다() {
        //given
        long num1 = 4;
        String operator = "/";
        long num2 = 2;
        Calculator calculator = new Calculator();

        //when
        long result = calculator.calculate(num1, operator, num2);

        //then
        assertEquals(2,result); //junit의 assertion
        assertThat(result).isEqualTo(2);// assertj 의 assertion 이건 의존성을 또 주입 받아야해 ~ 더쉽게 해주는
    }
    @Test
    public void 잘못된_연산자_에러() {
        //given
        long num1 = 2;
        String operator = "x";
        long num2 = 3;
        Calculator calculator = new Calculator();

        //when
        //then
        assertThrows(InvalidOperatorException.class,()->{
            calculator.calculate(num1, operator, num2);
        });


    }
}
