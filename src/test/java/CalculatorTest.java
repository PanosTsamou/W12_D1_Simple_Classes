import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;
    @Before
    public void before(){
        calculator= new Calculator();
    }
    @Test
    public void add(){
        int add = calculator.add(2,3);
        assertEquals(5,add);
    }
    @Test
    public void subtract(){
        int subtract = calculator.subtract(3,2);
        assertEquals(1,subtract);
    }

    @Test
    public void multiply(){
        int multiply = calculator.multiply(3,2);
        assertEquals(6,multiply);
    }
    @Test
    public void divide(){
        double divide = calculator.divide(10.,2.);
        assertEquals(5.00,divide,.00);
    }

}
