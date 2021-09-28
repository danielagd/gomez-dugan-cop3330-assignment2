package ex32;
import ex29.HandlingBadInput;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessingGameTest {

    @Test
    public void isNumeric()
    {
        assertEquals(false, HandlingBadInput.isNumeric("s"));
        assertEquals(true, HandlingBadInput.isNumeric("2"));
    }

}
