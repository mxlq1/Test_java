import org.example.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;
public class CalculatorTest {

    @Test
    public void testSub(){
        Calculator calc = new Calculator();
        assertNotNull(calc);
        int res = calc.subtract(10, 5);
        assertEquals(5, res);
    }
}
