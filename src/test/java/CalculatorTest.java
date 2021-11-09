import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;
    @Before
    public void before(){
        calculator = new Calculator(10, 5, 4.00, 2.00);
    }

    @Test
    public void canAdd(){
        assertEquals(15, calculator.addFunction());
    }

    @Test
    public void canSubtract(){
        assertEquals(5, calculator.subtractFunction());
    }

    @Test
    public void canMultiply(){
        assertEquals(50, calculator.multiplyFunction());
    }

    @Test
    public void canDivide(){
        assertEquals(2, calculator.divideFunction(), 0.0);
    }

}
