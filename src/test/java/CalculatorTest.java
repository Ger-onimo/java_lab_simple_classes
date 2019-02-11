
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;



public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void adds(){
        assertEquals(5, calculator.add(2, 3));

    }
    @Test
    public void subtract(){
        assertEquals(2, calculator.subtract(6, 4));
    }

    @Test
    public void multiply(){
        assertEquals(10, calculator.multiply(5, 2));
    }

    @Test
    public void divide(){
        assertEquals(6, calculator.divide(12, 2));
    }
}
