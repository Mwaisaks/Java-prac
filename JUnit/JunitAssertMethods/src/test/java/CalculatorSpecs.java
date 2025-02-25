import org.example.Calculator;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class CalculatorSpecs {

    Calculator calc = new Calculator();

    @Test
    @DisplayName("Assert Equal test Case")
    public void assertEqualTest(){
        //Assertions.assertEquals(4, calc.add(2, 2), () -> "Both are not equals");
        //Assertions.assertNotEquals(3, calc.add(2, 2));
    }

    @Test
    @DisplayName("Assert Array Equals test Case")
    public void assertArrayEquals(){
        Assertions.assertArrayEquals(new int[]{1, 2, 3}, new int[]{1, 2, 3});

    }

    @Test
    @DisplayName("Assert Not Null test Case")
    public void assertNotNull(){
        String nullString = null;
        String notNull = "hjdg";
        Assertions.assertNotNull(notNull);
    }

    @Test
    @DisplayName("Assert True test Case")
    public void assertTrueTest(){
        boolean trueVar = true;
        boolean falseVar =false;

        Assertions.assertTrue(trueVar);
    }


}
