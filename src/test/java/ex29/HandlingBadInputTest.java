package ex29;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class HandlingBadInputTest {

    @Test
    public void isNumeric()
    {
        assertEquals(false, HandlingBadInput.isNumeric("s"));
        assertEquals(true, HandlingBadInput.isNumeric("2"));
    }
}
