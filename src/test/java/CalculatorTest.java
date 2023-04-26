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
    @Test
    public void testmultiplyByZero(){
        Calculator calc = new Calculator();
        assertNotNull(calc);
        int res = calc.multiplyByZero(10);
        assertEquals(0, res);
    }
    @Test
    public void testabs(){
        Calculator calc = new Calculator();
        assertNotNull(calc);
        int res = calc.abs(-10);
        assertEquals(-10, res);
    }
}
