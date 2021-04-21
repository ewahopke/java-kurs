package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest {


    @Test
    public void shouldAddTwoValues(){
       int result = Calculator.add(1,2);

        Assertions.assertEquals(3, result);
}

@Test
public void shouldMultiplyTwoValues(){
        //given
    int firstValue = 1;
    int secondValue = 1;

        //when
    int result = Calculator.multiply(firstValue, secondValue);

        //then
    Assertions.assertEquals(1, result);
}
@Test
    public void shouldSubtractTwoValues(){
        //given
    int firstValue = 1;
    int secondValue = 1;

        //when
    int result = Calculator.subtraction(firstValue, secondValue);

    // then
    Assertions.assertEquals(0, result);
}
@Test
    public void shouldDivisionTwoValues(){
        //given
    int firstValue = 1;
    int secondValue = 1;

    //when
    int result = Calculator.division(firstValue, secondValue);

    //then
    Assertions.assertEquals(1, result);
}
}