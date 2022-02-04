import static org.junit.Assert.*;
import org.junit.*;

public class skilldemo4test{
    @Test
    public void production() {
        assertEquals(6, skilldemo4.product(2,3)); //should be 6
    }
}