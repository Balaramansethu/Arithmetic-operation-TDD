package com.saveetha;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArithmeticOperationTest {
    private static ArithmeticOperation arithmeticOperation;

    @BeforeAll
    static void beforeAllExecution(){
         arithmeticOperation = new ArithmeticOperation();
    }
    @Nested
    class Addition {
        @Test
        void toReturnSixWhenFourIsAddedWithTwo() {
            //Arrange

            int six = 6, four = 4, two = 2;
            //Act
            int actualAddition = arithmeticOperation.add(four, two);
            //Assert
            assertEquals(six, actualAddition);
        }
    }

    @Nested
    class Subtraction{
        @Test
        void toReturnTwoWhenFourIsSubtractedWithTwo(){
            //Arrange
            int four = 4, two=2;
            //Act
            int actualSubtraction = arithmeticOperation.subtract(four,two);
            //Assert
            assertEquals(two, actualSubtraction);
        }
    }

    @Nested
    class Multiplication {
        @Test
        void toReturnEightWhenFourIsMultipliedWithTwo() {
            //Arrange
            int eight = 8, four = 4, two = 2;
            //Act
            int actualMultiplication = arithmeticOperation.multiply(four, two);
            //Assert
            assertEquals(eight, actualMultiplication);
        }
    }

    @Nested
    class Division{
        @Test
        void toReturnTwoWhenFourIsDividedWithTwo(){
            //Arrange
            //Act
            int four=4,two=2;
            int actualDivision = arithmeticOperation.divide(four,two);
            //Assert
            assertEquals(two, actualDivision);
        }



    }

}
