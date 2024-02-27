import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Test Calculator class")
class CalculatorTest {
    @DisplayName("test add method")
    @Test
    void add() {
        //Triple A pattern
        //Arrange - setup test objects etc.
        Calculator regnemaskine1 = new Calculator();
        //Act - do the actual calculation or method run
        int actualValue = regnemaskine1.add(5, 3);
        int expectedValue = 8;
        //Assert - check if actual value is equal to expected value
        Assertions.assertEquals(expectedValue, actualValue);
    }


    @Test
    void subtract() {
        //Triple A - Arrange, Act, Assert
        Calculator regnemaskine2 = new Calculator();
        int actualValue = regnemaskine2.subtract(5, 2);
        int expectedValue = 3;
        Assertions.assertEquals(expectedValue, actualValue);
    }


    @Test
    void multiply() {
        //Triple A - Arrange, Act, Assert
        Calculator regnemaskine3 = new Calculator();
        int actualValue = regnemaskine3.multiply(5, 2);
        int expectedValue = 10;
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void testValidDivide() {
        //Triple A - Arrange, Act, Assert
        Calculator regnemaskine4 = new Calculator();
        int actualValue = regnemaskine4.divide(20, 10);
        int expectedValue = 2;
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void testInvalidDivide() {
        //Triple A - Arrange
        Calculator regnemaskine4 = new Calculator();
        //Act +  assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            regnemaskine4.divide(10, 0);

        });
    }
}