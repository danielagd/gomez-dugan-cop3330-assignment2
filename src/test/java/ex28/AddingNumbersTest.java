package ex28;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AddingNumbersTest {

    @Test
    public void findSum()
    {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(15, AddingNumbers.findSum(arr));
        arr = new int[]{1, 1, 1, 1, 1};
        assertEquals(5, AddingNumbers.findSum(arr));
    }
}
