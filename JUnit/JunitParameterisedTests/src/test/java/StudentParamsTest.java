import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.example.StudentScoreCalculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class StudentParamsTest {
    private static Object[] testValues(){
        return new Object[]{
                new Object[]{50, 50, 2500},
                new Object[]{-10, 50, -1},
                new Object[]{50, -1, -1},
                new Object[]{-1, -1, -1},
                new Object[]{150, 50, -1},
                new Object[]{50, 150, -1},
                new Object[]{150, 150, -1},
                new Object[]{0, 0, 0},
                new Object[]{100, 100, 10000},
        };
    }

    @Test
    @Parameters(method = "testValues")
    public void testNow(int mathScore, int literacyScore, int expectedScore){
        StudentScoreCalculator sco = new StudentScoreCalculator();
        sco.calculateSATScore(mathScore, literacyScore);
        Assert.assertEquals(expectedScore, sco.getSatScore());
    }
}
