import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloTest {

    @Test
    void testGreet() {
        Hello hello = new Hello();
        assertEquals("Hello World", hello.greet());
    }
}