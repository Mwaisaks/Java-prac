import org.example.Greetings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GreetingsTest {
    @Test
    public void testGreet(){
        Greetings greetings = new Greetings();

        Assertions.assertEquals("Hello Java Developer!", greetings.greet());
    }
}
