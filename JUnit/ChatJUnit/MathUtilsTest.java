import org.junit.jupiter.api.Test;

public class MathUtilsTest {
    private final MathUtils mathUtils = new MathUtils();

    @Test
    void testMultiply(){
        assertEquals(15, mathUtils.multiply(3, 5));
        assertEquals(0, mathUtils.multiply(0, 5));
        assertEquals(-20, mathUtils.multiply(-4, 5));
    }

    @Test
    void testDivide(){
        assertEquals
    }
}
